/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCModels;

import JavaMVCViews.*;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Vector;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;




/**
 *
 * @author Andrei Leon Salas
 */
public class DonacionCRModel {
    
    private String demotext;
    
    
    public String getDemotext() {
        return demotext;
    }

    public void setDemotext(String demotext) {
        this.demotext = demotext;
    }
    
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(Constants.sqlurl, Constants.sqluser, Constants.sqlpass);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
    
 /**
     * NO USAR, quedo de plantilla para un ejemplo de conexion
     * @return 
     */
    public ResultSet ListaDonantes() {
 
        String SQL = "SELECT num_cedula, apellido_1, apellido_2, nombre, sexo, fecha_nacimiento, tipo_sangre, \"idDireccion\", \"numTelefono\", litros_donados\n" +
"	FROM public.\"Donante\";";
 
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) 
        {
            // display actor information
            //displayActor(rs);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        
    }
    
    /**
     * Recibe una jtable, y la rellena con los datos
     * 
     * @param table
     * @param SQL 
     */
    public void FillTable(JTable table, String SQL)
    {
    try
    {
        //CreateConnection();
        Connection conn = connect();
        Statement stmt = conn.createStatement();
        //To remove previously added rows
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            //To remove previously added rows
            while(table.getRowCount() > 0)
            {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }   
            while(table.getColumnCount() > 0)
            {
                ((DefaultTableModel) table.getModel()).setColumnCount(0);//remove all columns
            }   
            int columns = rs.getMetaData().getColumnCount();
            ResultSetMetaData metaData = rs.getMetaData();
            //Get all column names from meta data and add columns to table model
            for (int columnIndex = 1; columnIndex <= columns; columnIndex++){
                ((DefaultTableModel) table.getModel()).addColumn(metaData.getColumnLabel(columnIndex));
            }
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++)
                {
                    row[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
            }
        }
    }
    catch(SQLException e)
    {
        throw new RuntimeException(e);
    }
    
}

    /*
    agregar el campo de la provinicia
    */
    public void InsertarDonador(long num_cedula,String apellido_1,String apellido_2,String nombre,String sexo,String fecha_nacimiento,String tipo_sangre,long numTelefono, long litros_donados, int provincia, String dir_exacta) {
        try {
            String sql = "INSERT INTO public.\"Donante\" (num_cedula, apellido_1, apellido_2, nombre, sexo, fecha_nacimiento, tipo_sangre, \"numTelefono\", litros_donados, provincia, dir_exacta)	VALUES (" 
                    + "'" +  num_cedula + "'" +  "," 
                    + "'" + apellido_1 + "'" + "," 
                    + "'" + apellido_2 + "'" + "," 
                    + "'" + nombre + "'" + ","
                    + "'" + sexo + "'" + "," 
                    + "'" + fecha_nacimiento + "'" + "," 
                    + "'" + tipo_sangre + "'" + "," 
                    + numTelefono + "," 
                    + litros_donados + "," 
                    + provincia + "," 
                    + "'" + dir_exacta+ "'" + ""+");";
            Connection conn = connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(DonacionCRModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ChangeVal(LitrosPorSexoView lpSexo)
    {
    try
    {
        //CreateConnection();
        Connection conn = connect();
        Statement stmt = conn.createStatement();
        //To remove previously added rows
        String SQL = "SELECT SUM(litros_donados) as p_total" +
"	FROM public.\"Donante\"\n" +
"	WHERE sexo = 'femenino';";
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            if (rs.next()) {
            lpSexo.femCant.setText(Float.toString(rs.getFloat(1)));
            }
        }
        SQL = "SELECT SUM(litros_donados) as p_total" +
"	FROM public.\"Donante\"\n" +
"	WHERE sexo = 'masculino';";
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            if (rs.next()) {
            lpSexo.mascCant.setText(Float.toString(rs.getFloat(1)));
            }
        }
    }
    catch(SQLException e)
    {
        throw new RuntimeException(e);
    } 
}
    
    public void BloodTypes(Popup lpTipe)
    {
    try
    {
        //CreateConnection();
        Connection conn = connect();
        Statement stmt = conn.createStatement();
        //It actualizates it-self every time is executed
        String SQL = "SELECT SUM(litros_donados) as p_total" +
"	FROM public.\"Donante\"\n" +
"	WHERE tipo_sangre = 'A+';";
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            if (rs.next()) {
            lpTipe.Apositivo.setText(Float.toString(rs.getFloat(1)));
            }
        }
        SQL = "SELECT SUM(litros_donados) as p_total" +
"	FROM public.\"Donante\"\n" +
"	WHERE tipo_sangre = 'B+';";
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            if (rs.next()) {
            lpTipe.Bpositivo.setText(Float.toString(rs.getFloat(1)));
            }
        }
        SQL = "SELECT SUM(litros_donados) as p_total" +
"	FROM public.\"Donante\"\n" +
"	WHERE tipo_sangre = 'AB+';";
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            if (rs.next()) {
            lpTipe.ABpositivo.setText(Float.toString(rs.getFloat(1)));
            }
        }
        SQL = "SELECT SUM(litros_donados) as p_total" +
"	FROM public.\"Donante\"\n" +
"	WHERE tipo_sangre = 'O+';";
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            if (rs.next()) {
            lpTipe.Opositivo.setText(Float.toString(rs.getFloat(1)));
            }
        }
        SQL = "SELECT SUM(litros_donados) as p_total" +
"	FROM public.\"Donante\"\n" +
"	WHERE tipo_sangre = 'A-';";
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            if (rs.next()) {
            lpTipe.Anegativo.setText(Float.toString(rs.getFloat(1)));
            }
        }
        SQL = "SELECT SUM(litros_donados) as p_total" +
"	FROM public.\"Donante\"\n" +
"	WHERE tipo_sangre = 'B-';";
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            if (rs.next()) {
            lpTipe.Bnegativo.setText(Float.toString(rs.getFloat(1)));
            }
        }
        SQL = "SELECT SUM(litros_donados) as p_total" +
"	FROM public.\"Donante\"\n" +
"	WHERE tipo_sangre = 'AB-';";
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            if (rs.next()) {
            lpTipe.ABnegativo.setText(Float.toString(rs.getFloat(1)));
            }
        }
        SQL = "SELECT SUM(litros_donados) as p_total" +
"	FROM public.\"Donante\"\n" +
"	WHERE tipo_sangre = 'O-';";
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            if (rs.next()) {
            lpTipe.Onegativo.setText(Float.toString(rs.getFloat(1)));
            }
        }

    }
    catch(SQLException e)
    {
        throw new RuntimeException(e);
    } 
}
    
    public void TotalBlood()
    {
    try
    {
        //CreateConnection();
        Connection conn = connect();
        Statement stmt = conn.createStatement();
        //To remove previously added rows
        String SQL = "SELECT SUM(litros_donados) as p_total" +
"	FROM public.\"Donante\"\n";
        try (ResultSet rs = stmt.executeQuery(SQL)) {
            if (rs.next()) {
            String msg = Float.toString(rs.getFloat(1));
            JOptionPane.showMessageDialog(null, "Cantidad de sangre total: "+msg, "Banco de sangre", 1);
            }
        }
    }
    catch(SQLException e)
    {
        throw new RuntimeException(e);
    } 
}

    public void InsertarDonacion(String SQL) {
            try
    {
        //CreateConnection();
        Connection conn = connect();
        Statement stmt = conn.createStatement();
        stmt.execute(SQL);
    }
    catch(SQLException e)
    {
        throw new RuntimeException(e);
    } 
    }
    
    public void ConnectaraMongoDB (JTable table)
    {
        
        //MongoClientURI uri = new MongoClientURI(
        //    "mongodb+srv://admin:admin@localhost");
        //MongoClient mongoClient = new MongoClient(uri);
        //MongoDatabase database = mongoClient.getDatabase("DonacionCR");
        
            // TODO add your handling code here:
        try {
            MongoClient mongoClient = new
            MongoClient( "localhost" , 27017 );
            DB db = mongoClient.getDB( "DonacionCR" );
            DBCollection coll = db.getCollection("DonacionCR");
            DBCursor cursor = coll.find();
            String[] columnNames = {"num_cedula","nombre","apellido_1","apellido_2"};
            DefaultTableModel model = new
            DefaultTableModel(columnNames, 0);
        while(cursor.hasNext()) {
            DBObject obj = cursor.next();
            String num_cedula = (String)obj.get("num_cedula");
            String nombre = (String)obj.get("nombre");
            String apellido_1 = (String)obj.get("apellido_1");
            String apellido_2 = (String)obj.get("apellido_2");
            model.addRow(new Object[]
        { num_cedula,nombre,apellido_1,apellido_2});
        }
            //TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
            //table.setRowSorter(sorter);

            
            table.setModel(model);
            TableSorter(table);
            cursor.close();
            mongoClient.close();
        } catch (Exception ex)
        {}
        
    }
    
    
        
}



