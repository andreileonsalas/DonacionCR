/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCModels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
                ((DefaultTableModel) table.getModel()).setColumnCount(0);
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
    }
}
    
    
}
