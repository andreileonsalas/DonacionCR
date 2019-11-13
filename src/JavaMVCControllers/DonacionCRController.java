/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCControllers;


import JavaMVCViews.*;
import JavaMVCModels.*;
import com.toedter.calendar.JDateChooser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrei Leon Salas
 */
public class DonacionCRController {
    
    private DonacionCRModel model;
    private DonacionCRView view;
    private Mostrarqueries mostrarqueries;
    String SQL = "SELECT num_cedula, apellido_1, apellido_2, nombre, sexo, fecha_nacimiento, tipo_sangre, \"idDireccion\", \"numTelefono\", litros_donados\n" +
"	FROM public.\"Donante\";";
    
    public void startApplication(DonacionCRModel model,DonacionCRView view) {
        // View the application's GUI
        //view = new DonacionCRView();
        //model = new DonacionCRModel();
        
        
        
        this.view = new DonacionCRView(); //Crea la vista, por decirlo asi, es uno por ventana
        this.mostrarqueries = new Mostrarqueries(); //Crea la vista de queries, por decirlo asi, es uno por ventana
        this.model = new DonacionCRModel(); //Crea el modelo, por decirlo asi, de donde se consiguen los datos
        this.view.setController(this); //hace que este view se le asigne al controlador (poner todo debajo del controlador)
        this.view.setVisible(true); //Lo hace visible
        this.mostrarqueries.setController(this);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void InsertarDonacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        query = "SELECT num_donacion, cedula_donante, cant_donada, fecha_donacion	FROM public.\"Registro_Donacion\"	WHERE fecha_donacion='"+s+"';";
        this.model.FillTable(mostrarqueries.jTable1, query);
        this.view.setVisible(false);
        this.mostrarqueries.setVisible(true);
    }

    public void ListarTotalSangreporTipodeSangre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ListarDonadoresDiabetes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void LitrosporTipoSangre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void PromedioLitroporPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ListaDonadoresAlfabetico() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.SQL =  "SELECT num_cedula, apellido_1, apellido_2, nombre, sexo, fecha_nacimiento, tipo_sangre, \"idDireccion\", \"numTelefono\", litros_donados\n" +
"	FROM public.\"Donante\"\n" +
"	ORDER By\n" +
"	nombre ASC,\n" +
"	apellido_1 ASC,\n" +
"	apellido_2 ASC;";
        this.model.FillTable(this.mostrarqueries.jTable1, SQL); //Recibe un jtable, y lo rellena con el query que uno quiera
        this.mostrarqueries.setVisible(true);
        this.view.setVisible(false);
    }

    public void ConsultarInformacionDonador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void volver() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.view.setVisible(true);
        this.mostrarqueries.setVisible(false);
    }
    
    
}
