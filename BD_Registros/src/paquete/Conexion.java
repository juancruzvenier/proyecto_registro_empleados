package paquete;

import java.sql.*; // importamos todos las librerias de sql
import javax.swing.JOptionPane;

public class Conexion {
    
    private Conexion(){
        
    }

    // primero que todo, crear variable en la que guardamos el estado de la conexión
    private static Connection conexion;

    // crear variable para crear una sola instancia
    private static Conexion instancia; // La variable instancia es de tipo Conexion porque va a almacenar la unica instancia de esa clase, lo que asegura que todas las partes del programa usen la misma conexión a la base de datos

    //crear variables para conectarnos a la base de datos
    private static final String url = "jdbc:mysql://localhost/bd_registros";
    private static final String username = "root";
    // LLENAR CON CONTRASEÑA PROPIA
    private static final String password = "";

    // metodo para conectar a la bd
    public Connection conectar() {
        try {

            // intentar cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //guardar en conexion la base de datos
            //DriverManager hace referencia a que estamos utilizando un conector
            //con getConnection obtenemos la conexion mediante los parametros
            conexion = DriverManager.getConnection(url, username, password);
            //JOptionPane.showMessageDialog(null, "¡Conexión exitosa!");
            return conexion;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return conexion;
    }
    
    // metodo para cerrar la conexion    
    public void cerrarConexion() throws SQLException{
        
        try {
            // intentar cerrar
            conexion.close();
            // JOptionPane.showMessageDialog(null, "Desconectado.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            conexion.close();
        }finally{
            conexion.close();
        }
        
        
    }
    
    // PATRON SINGLETON
    // static para poder llamarlo desde la clase Registro
    
    public static Conexion getInstance(){ //obtener UNA instancia
        if (instancia==null) {
            instancia = new Conexion();
        }
        
        return instancia;
    }

}
