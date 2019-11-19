/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCControllers;


import JavaMVCViews.*;
import JavaMVCModels.*;
import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;    

/**
 *
 * @author Andrei Leon Salas
 */
public class DonacionCRController {
    
    private DonacionCRModel model;
    private DonacionCRView view;
    private Mostrarqueries mostrarqueries;
    private MostrarEnfermedades mostrarenfermedades;
    String SQL = "SELECT num_cedula, apellido_1, apellido_2, nombre, sexo, fecha_nacimiento, tipo_sangre, \"idDireccion\", \"numTelefono\", litros_donados\n" +
"	FROM public.\"Donante\";";
    private RegistrarDonador registrardonador;
    private Popup litrosPorTipo;
    private LitrosPorSexoView litrosPorSexo;
    
    public void startApplication(DonacionCRModel model,DonacionCRView view) {
        // View the application's GUI
        //view = new DonacionCRView();
        //model = new DonacionCRModel();
        
        
        
        this.view = new DonacionCRView(); //Crea la vista, por decirlo asi, es uno por ventana
        this.mostrarqueries = new Mostrarqueries(); //Crea la vista de queries, por decirlo asi, es uno por ventana
        this.mostrarenfermedades = new MostrarEnfermedades(); //Crea la vista de queries, por decirlo asi, es uno por ventana
        this.model = new DonacionCRModel(); //Crea el modelo, por decirlo asi, de donde se consiguen los datos
        this.registrardonador = new RegistrarDonador();
        this.registrardonador.setController(this);//le asigna el controlador a el donador
        this.view.setController(this); //hace que este view se le asigne al controlador (poner todo debajo del controlador)
        this.view.setVisible(true); //Lo hace visible
        this.mostrarqueries.setController(this);
        this.mostrarenfermedades.setController(this);
        this.litrosPorTipo = new Popup();
        this.litrosPorTipo.setController(this);
        
        this.litrosPorSexo = new LitrosPorSexoView();
        this.litrosPorSexo.setController(this);
        
        //this.test();
        //model.connect();        
    }
    
    public String getMessage() {
        try {
            //DonacionCR model = new DonacionCRModel();
            return this.model.getDemotext();
        } catch (Exception er) {
            return "There was an error.";
        }
    }
    
    public void writeMessage(String message) {
        try {
            //DonacionCR model = new DonacionCRModel();
            this.model.setDemotext(message);
        } catch (Exception er) {
            
        }
    }
    public void test(){
        this.mostrarqueries.setVisible(true); //Muestra el queri
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DonacionCRController.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.model.FillTable(mostrarqueries.jTable1, SQL); //Recibe un jtable, y lo rellena con el query que uno quiera
        this.SQL = "SELECT \"Codigo\", \"Descripcion\", \"Nombre\"\n" +
"	FROM public.\"Enfermedad\";";
        
                try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DonacionCRController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.FillTable(mostrarqueries.jTable1, SQL); //Recibe un jtable, y lo rellena con el query que uno quiera
        
    }

    public void RegistrarDonador() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.registrardonador.setVisible(true);
        this.view.setVisible(false);
    }

    public void InsertarDonacion() {
        Long cedula = null;
        double donacion = 0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/DD/yyyy");  
        LocalDateTime now = LocalDateTime.now(); 
        try {
            cedula = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el numero de cedula: "));
        } catch (HeadlessException headlessException) {
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "No digito un numero de cedula");
            return;
        }
        try {
            donacion = parseDouble(JOptionPane.showInputDialog(null, "Digite los litros a donar: "));
        } catch (HeadlessException headlessException) {
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "No digito un numero");
            return;
        }
        this.SQL = "INSERT INTO public.\"Registro_Donacion\"(\n" +
"	cedula_donante, cant_donada, fecha_donacion)\n" +
"	VALUES ("
                + "'" + cedula +"'"
                + ", "
                + "'" + donacion +"'"
                + ", "
                + "'" + now +"'"
                + ");";
        this.model.InsertarDonacion(this.SQL);
        try {
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }

    public void LitrosporFechaNacimiento() {
        String query;
        String fecha;
        JDateChooser jd = new JDateChooser();
        String message ="Choose start date:\n";
        Object[] params = {message,jd};
        JOptionPane.showConfirmDialog(null,params,"Start date", JOptionPane.PLAIN_MESSAGE);
        String s="";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        s=sdf.format(((JDateChooser)params[1]).getDate());//Casting params[1] makes me able to get its information
        fecha = "05/09/2012";
        query = "SELECT SUM (cant_donada) AS total_donado\n" +
"	FROM public.\"Registro_Donacion\" a\n" +
"	INNER JOIN public.\"Donante\" b ON a.num_donacion = b.num_cedula\n" +
"	WHERE fecha_nacimiento = '"+ s +"'\n" +
"	;";
        //query = "SELECT num_donacion, cedula_donante, cant_donada, fecha_donacion	FROM public.\"Registro_Donacion\"	WHERE fecha_donacion='"+s+"';";
        this.model.FillTable(mostrarqueries.jTable1, query);
        
        this.view.setVisible(false);
        this.mostrarqueries.setVisible(true);
    }

    public void TotalSangre() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //hacer un pop up que muestre la cantidad actual de litros de sangre de la bd
        this.model.TotalBlood();
        
    }

    public void ListarDonadoresDiabetes() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String query;
        query = "SELECT *\n" +
"	FROM public.\"Registro_Enfermedad\" c\n" +
"	INNER JOIN public.\"Donante\" b ON c.\"cedulaDonador\" = b.num_cedula\n" +
"	WHERE c.\"nombre_enfermedad\"  = 'Diabetes'\n" +
"	;";
        this.model.FillTable(mostrarqueries.jTable1, query);
        this.view.setVisible(false);
        this.mostrarqueries.setVisible(true);
        this.mostrarqueries.jButton2.setVisible(true);
               
    }

    public void LitrosporTipoSangre() {
        this.model.BloodTypes(this.litrosPorTipo);
        this.litrosPorTipo.setVisible(true);
        this.view.setVisible(false); 
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void PromedioLitroporPersona() {
        Long cedula = null;
        try {
            cedula = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el numero de cedula:"));
        } catch (HeadlessException headlessException) {
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "No digito un numero");
            return;
        }
        this.SQL = "SELECT\n" +
"       TO_CHAR(\n" +
"	AVG (cant_donada) ,\n" +
"      	'FM999999999.00'\n" +
"       )\n" +
"	AS promedio\n" +
"	FROM public.\"Registro_Donacion\" a\n" +
"	INNER JOIN public.\"Donante\" b ON a.cedula_donante = b.num_cedula\n" +
"	WHERE num_cedula = "+ cedula +"\n" +
"	;";
        
        try {
            this.model.FillTable(this.mostrarqueries.jTable1, SQL);
            this.mostrarqueries.setVisible(true);
            this.view.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        



//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /*
        this.SQL =  "SELECT num_cedula, apellido_1, apellido_2, nombre \n" +
"	FROM public.\"Donante\"\n" +
"       INNER JOIN public.\""\" ON A .pka = B.fka;
"	ORDER By\n" +
"	apellido_1 ASC,\n" +
"	apellido_2 ASC,\n" +
"	nombre ASC;";
        */
    }

    public void ListaDonadoresAlfabetico() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.SQL =  "SELECT *" +
"	FROM public.\"Donante\"\n" +
"	ORDER By\n" +
"	apellido_1 ASC,\n" +
"	apellido_2 ASC,\n" +
"	nombre ASC;";
        this.model.FillTable(this.mostrarqueries.jTable1, SQL); //Recibe un jtable, y lo rellena con el query que uno quiera
        this.mostrarqueries.setVisible(true);
        this.view.setVisible(false);
    }

    public void ConsultarInformacionDonador() {
        Long cedula = null;
        try {
            cedula = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el numero de cedula:"));
        } catch (HeadlessException headlessException) {
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "No digito un numero");
            return;
        }
        this.SQL = "SELECT *" +
"	FROM public.\"Donante\"\n" +
"	WHERE num_cedula = '"+ cedula +"';";
        
        try {
            this.model.FillTable(this.mostrarqueries.jTable1, SQL);
            this.mostrarqueries.setVisible(true);
            this.view.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        

        
    }

    public void volver() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.view.setVisible(true);
        this.mostrarqueries.setVisible(false);
        this.mostrarqueries.jButton2.setVisible(false);
    }
    
    public void volverLpT() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.view.setVisible(true);
        this.litrosPorTipo.setVisible(false);
    }
    
    public void volverLpS() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.view.setVisible(true);
        this.litrosPorSexo.setVisible(false);
    }

    public void ListarTotalSangreporSexo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.model.ChangeVal(this.litrosPorSexo);
        this.litrosPorSexo.setVisible(true);
        this.view.setVisible(false);
    }
    
    

    public void RegistrarDonadoralaBase() {
        this.registrardonador.jTextField2.getText();
        this.model.InsertarDonador(
                Long.valueOf(this.registrardonador.jTextField2.getText()), //cedula
                this.registrardonador.jTextField3.getText(), //primer apellido
                this.registrardonador.jTextField4.getText(), //segundo apellido
                this.registrardonador.jTextField5.getText(), //nombre
                this.registrardonador.jComboBox2.getSelectedItem().toString(), //sexo
                this.registrardonador.jTextField7.getText(), //fecha de nacimiento
                this.registrardonador.jComboBox3.getSelectedItem().toString(), //tipo de sangre
                Long.valueOf(this.registrardonador.jTextField10.getText()), //numTelefono
                0, //litros donados
                this.registrardonador.jComboBox1.getSelectedIndex(), //provincia
                this.registrardonador.jTextField11.getText() //dir exacta
                ); 
        this.registrardonador.setVisible(false);
        this.view.setVisible(true);
    }

    public void ListarEnfermedades(String cedula) {

        this.SQL = "SELECT *\n" +
"	FROM public.\"Registro_Enfermedad\" c\n" +
"	INNER JOIN public.\"Donante\" b ON c.\"cedulaDonador\" = b.num_cedula\n" +
"	WHERE c.\"cedulaDonador\"  = "+cedula+"\n" +
"	;";
        
        try {
            this.model.FillTable(this.mostrarenfermedades.jTable1, SQL);
            this.mostrarenfermedades.setVisible(true);
            this.mostrarqueries.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void volverdeenfermedades() {
        this.mostrarenfermedades.setVisible(false);
        this.mostrarqueries.setVisible(true);
    }

    public void ListarMedicamentos() {
        
        this.SQL ="SELECT \"Codigo\", \"Nombre\", \"Descripcion\"\n" +
"	FROM public.\"Medicamento\";";
        
        try {
            this.model.FillTable(this.mostrarqueries.jTable1, this.SQL);
            
            this.mostrarqueries.setVisible(true);
            this.view.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void volverdesdeDonar() {
        this.registrardonador.setVisible(false);
        this.view.setVisible(true);
    }
    
    
}
