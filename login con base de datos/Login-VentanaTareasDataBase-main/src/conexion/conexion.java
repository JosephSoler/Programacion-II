package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conexion {
    //nombre de la base //url   //user y pas //driver com.mysql.cj.jdbc.Driver
    //variable conexion da error cuando es conexion
  
    //cambiar conexion
String url="jdbc:mysql://localhost:3306/log";
String user="root";
String password="2002kly";
String driver="com.mysql.cj.jdbc.Driver";
Connection cx;

public conexion(/*String bd*/){
  //  this.bd=bd;
}
public Connection conectar(){
    
    try {
        Class.forName(driver);
        cx=DriverManager.getConnection(url,user,password);
            System.out.println("conectado");
            
     } catch (ClassNotFoundException | SQLException ex) {
         System.out.println("No se ha conectado");
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
       
     }
    return cx;
}
 public Connection getConexion(){
        Connection con = null;
        try{
             Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
public void desconectar(){
    try {
        cx.close();
    } catch (SQLException ex) {
        Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    public static void main(String[] args) {
        conexion test=new conexion();
        test.conectar();
    }
    
    //otra forma de conectarme?
   


  
    
}