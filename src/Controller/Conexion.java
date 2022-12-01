package Controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion {
     public static Connection getConnection()
    {
        Connection con = null;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/pesca";
        String user = "root";
        String pass = "root";
        
        try
        {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
        return con;
    }
     public void GenerarPDF(){
                      Document doc = new Document();
                              try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/Desktop/reporte_barcos.pdf"));
            doc.open();
            PdfPTable tabla = new PdfPTable(3);
            tabla.addCell("Nombre");
            tabla.addCell("Código");
            tabla.addCell("Multa");
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pesca", "root", "root");
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM barcos ");
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    do{
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                    }while(rs.next());
                    
                    doc.add(tabla);
                }
               JOptionPane.showMessageDialog(null, "Reporte realizado");
               
                doc.close();
            } catch (DocumentException | SQLException e) {
            }
        } catch (DocumentException | FileNotFoundException e) {

        }

         
     }
      public void GenerarPDF2(){
                      Document doc = new Document();
                              try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/Desktop/reporte_peces.pdf"));
            doc.open();
            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("Nombre");
            tabla.addCell("Código");
            tabla.addCell("cantidad");
            tabla.addCell("estado");
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pesca", "root", "root");
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM peces");
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    do{
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                    }while(rs.next());
                    
                    doc.add(tabla);
                }
               JOptionPane.showMessageDialog(null, "Reporte realizado");
               
                doc.close();
            } catch (DocumentException | SQLException e) {
            }
        } catch (DocumentException | FileNotFoundException e) {

        }

         
     }
     public boolean registrarpeces(String nombre, String codigo,int cantidad, String estado )
    {
        String sql = "INSERT INTO peces (nombre,codigo,cantidad,estado) VALUES (?,?,?,?)";
        
        Connection conectar;
        PreparedStatement pst;
        
        try
        {
            conectar=Conexion.getConnection();
            pst=conectar.prepareStatement(sql);
            
            pst.setString(1,nombre);
            pst.setString(2, codigo);
            pst.setInt(3, cantidad);
            pst.setString(4, estado);
            
            int result = pst.executeUpdate();
            
            if (result != 0)
            {
                JOptionPane.showMessageDialog(null,"Los datos se han guardado satisfactoriamente");
                
                return true;

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error en la transaccion");
                
                return false;
            }
            
        }
        catch(SQLException e)
        {            
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
            return false;
        }
        
    }
     public boolean registrarbarco(String nombre, String codigo, int multas)
    {
        String sql = "INSERT INTO barcos (nombre,codigo,multas) VALUES (?,?,?)";
        
        Connection conectar;
        PreparedStatement pst;
        
        try
        {
            conectar=Conexion.getConnection();
            pst=conectar.prepareStatement(sql);
                   
            
            pst.setString(1,nombre);
            pst.setString(2, codigo);
            pst.setInt(3,multas);
            
            int result = pst.executeUpdate();
            
            if (result != 0)
            {
                JOptionPane.showMessageDialog(null,"Los datos se han guardado satisfactoriamente");
                
                return true;

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error en la transaccion");
                
                return false;
            }
            
        }
        catch(SQLException e)
        {            
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
            return false;
        }
        
    }
     public String mostrarpeces()
    {
        String v="";
        String sql = "SELECT * FROM peces";        
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            cn = Conexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                String i = rs.getString("nombre");
                
                String n = rs.getString("codigo");
                
                String t = rs.getString("cantidad");
                
               String d=rs.getString("estado");
                v=v+"Nombre: "+i+" codigo: "+n+" Cantidad de pesca: "+t+" Estado: "+d+"\n";
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return v;
    }
      public String mostrarbarcos()
    {
        String v="";
        String sql = "SELECT * FROM barcos";        
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            cn = Conexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                String i = rs.getString("nombre");
                
                String n = rs.getString("codigo");
                
                String t = rs.getString("multas");
                
                v=v+"Nombre: "+i+" codigo: "+n+" Multas: "+t+"\n";
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return v;
    }
      public String mostrarpecespeligro()
    {
        String v="";
        String sql = "select * from peces where estado="+"3";        
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            cn = Conexion.getConnection();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                String i = rs.getString("nombre");
                
                String n = rs.getString("codigo");
                
                String t = rs.getString("cantidad");
                
               String d=rs.getString("estado");
                v=v+"Nombre: "+i+" codigo: "+n+" Cantidad de pesca: "+t+" Estado: "+d+"\n";
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return v;
    }
      public java.sql.ResultSet buscarbajos(int Id) throws SQLException
    {
        ResultSet rs = null;
        try
        {   
            String sql = "SELECT * FROM barcos WHERE codigo="+String.valueOf(Id);
            Connection conectar;
            PreparedStatement pst;
            
            
            conectar = Conexion.getConnection();
            
            pst = conectar.prepareStatement(sql);
            
            rs = pst.executeQuery();
            
            if (rs.getRow() == 0)
            {             
                return rs;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error en la transaccion");
                
                return rs;
            }
            
        }
        catch(SQLException e)
        {            
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
           return rs;
        }
    }
      public java.sql.ResultSet buscarpeces(String Id) throws SQLException
    {
        ResultSet rs = null;
        try
        {   
            String sql = "SELECT * FROM peces WHERE codigo="+Id;
            Connection conectar;
            PreparedStatement pst;
            
            
            conectar = Conexion.getConnection();
            
            pst = conectar.prepareStatement(sql);
            
            rs = pst.executeQuery();
            
            if (rs.getRow() == 0)
            {             
                return rs;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error en la transaccion");
                
                return rs;
            }
            
        }
        catch(SQLException e)
        {            
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
           return rs;
        }
    }
      public java.sql.ResultSet buscarbarcosmul(String nombre,String codigo,int multas) throws SQLException
    {
        Connection cn = null;
        Connection conectar;
        PreparedStatement pst;
                   try
{
    
    cn = Conexion.getConnection();
    conectar = Conexion.getConnection();
   String sql="UPDATE barcos SET nombre=?, multas=? WHERE codigo=?";
   PreparedStatement ps = null;
   pst = conectar.prepareStatement(sql);
   pst.setString(1, nombre);
   pst.setInt(2, multas);
   pst.setString(3, codigo);
   pst.executeUpdate();
   JOptionPane.showMessageDialog(null, "Multas aplicadas");
}
catch (Exception e)
{
   e.printStackTrace();
}        
         return null;
 }
      public void modificar(String nombre,String codigo,int multas) throws SQLException{
         
              PreparedStatement ps = null;
            Conexion Auxiliar = new Conexion();
            Connection Auxiliar2 = Auxiliar.getConnection();
            String sql="UPDATE barcos SET nombre=?, multas=? WHERE codigo=?";
            try{
                ps=Auxiliar2.prepareStatement(sql);
                ps.setString(1, nombre);
                ps.setString(2, codigo);
                ps.setInt(3, multas);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Si");
          }
          catch (SQLException e) {
                System.err.println(e);
            } finally {
                try {
                    Auxiliar2.close();
                } catch (SQLException e) {
                    System.err.println(e);

                }

      }
    }
}