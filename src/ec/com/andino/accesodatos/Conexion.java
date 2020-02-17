/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.andino.accesodatos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */

public class Conexion {
    private Connection con;
    public Statement sentencia;
    private static String url;
    private static String usuario = "postgres";
    private static String clave = "1234";
    private static String DRIVER;

    public Conexion() {
        
    }

    public Conexion(Connection con, Statement sentencia) {
        this.con = con;
        this.sentencia = sentencia;
    }

    public static void dataConexion() throws FileNotFoundException, IOException{
        FileInputStream fis=new FileInputStream("conexion.prop"); 
        Properties p=new Properties (); 
        p.load(fis); 
        url= (String) p.get ("url"); 
        DRIVER = (String) p.get ("driver"); 
    }
    
    public Connection conectar() throws IOException{
        dataConexion();
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(url,usuario,clave);
            sentencia = con.createStatement();
        }catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error al cargar el driver: ");
                System.exit(1);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos, el sistema se cerrará",
                    "HU.ANDINO", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        return con;
    }
    
    public Connection getConexion(){
       return con;
    }

    public ResultSet ejecutarQuery(String sql) throws IOException{
        ResultSet rst = null;
        conectar();
        try{
            Statement stm = con.createStatement();
            rst = stm.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally{
            desconectar();
        }
        return rst;
    }

    public ResultSet ejecutarQuery(String sql, List<Parametro> lst) throws IOException{
        ResultSet rst = null;
        try {
            conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            for (Parametro par : lst) {
                if (par.getValor() instanceof java.util.Date) {
                    ps.setObject(par.getPosicion(),
                            new java.sql.Date(((java.util.Date) par.getValor()).getTime()));
                } else {
                    ps.setObject(par.getPosicion(), par.getValor());
                }
            }
            rst = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            desconectar();
        }
        return rst;
    }
    
    public ResultSet ejecutarSQLSelect(String sql){
       ResultSet resultado;
       try {
          PreparedStatement ps = con.prepareStatement(sql);
          resultado = ps.executeQuery();
          return resultado;
       } catch (SQLException ex) {
          System.err.println("Error "+ex);
          return null;
       }
    }

    public int ejecutaComando(String sql) throws IOException{
        int numFilasAfectadas = 0;
        try {
            conectar();
            Statement stm = con.createStatement();
            numFilasAfectadas = stm.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            desconectar();
        }
        return numFilasAfectadas;
    }

    public int ejecutaComando(String sql, List<Parametro> lst) throws IOException{
        int numFilasAfectadas = 0;
        try {
            conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            for (Parametro prm : lst) {
                if (prm.getValor() instanceof java.util.Date) {
                    ps.setObject(prm.getPosicion(), prm.getValor());
                } 
            }
            numFilasAfectadas = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            desconectar();
        }
        return numFilasAfectadas;
    }
    
    public boolean ejecutarSQL(String sql){
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute(sql);
            return true;
        }catch (SQLException ex){
            return false;
        }
    }

    public void desconectar(){
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
