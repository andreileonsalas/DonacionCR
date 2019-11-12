/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCControllers;

import JavaMVCViews.*;
import JavaMVCModels.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void startApplication(DonacionCRModel model,DonacionCRView view) {
        // View the application's GUI
        //view = new DonacionCRView();
        //model = new DonacionCRModel();
        
        String SQL = "SELECT num_cedula, apellido_1, apellido_2, nombre, sexo, fecha_nacimiento, tipo_sangre, \"idDireccion\", \"numTelefono\", litros_donados\n" +
"	FROM public.\"Donante\";";
        
        this.view = new DonacionCRView(); //Crea la vista, por decirlo asi, es uno por ventana
        this.mostrarqueries = new Mostrarqueries(); //Crea la vista de queries, por decirlo asi, es uno por ventana
        this.model = new DonacionCRModel(); //Crea el modelo, por decirlo asi, de donde se consiguen los datos
        this.view.setController(this); //hace que este view se le asigne al controlador (poner todo debajo del controlador)
        this.view.setVisible(true); //Lo hace visible
        model.FillTable(mostrarqueries.jTable1, SQL); //Recibe un jtable, y lo rellena con el query que uno quiera
        this.mostrarqueries.setVisible(true); //Muestra el queri
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
    
    
}
