/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;


import bd.CnnMySql;
import bd.CnnSqlServer;
import java.sql.SQLException;
import java.util.ResourceBundle;


/**
 *
 * @author chinchillal
 */
public class inicio {

    private static final ResourceBundle cnnConfig = ResourceBundle.getBundle("bd/Resources/cnnConfig");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {           
        String mensaje = "";

        try {

            CnnMySql conMySql = new CnnMySql();
            conMySql.setServidor(cnnConfig.getString("NombreServidor"));
            conMySql.setBD(cnnConfig.getString("NombreBaseDatos"));            
            conMySql.setUsuario(cnnConfig.getString("Usuario"));
            conMySql.setContrasenya(cnnConfig.getString("Contrasenya"));
            conMySql.setPuerto(Integer.valueOf(cnnConfig.getString("Puerto")));
            conMySql.iniciarConexion();
                                                                     
            /*CnnSqlServer conSQLServer = new CnnSqlServer();
            conSQLServer.setNombreServidor(cnnConfig.getString("NombreServidor"));
            conSQLServer.setNombreBaseDatos(cnnConfig.getString("NombreBaseDatos"));
            conSQLServer.setNombreAplicacion(cnnConfig.getString("NombreAplicacion"));
            conSQLServer.setUsuario(cnnConfig.getString("Usuario"));
           conSQLServer.setContraseyna(cnnConfig.getString("Contrasenya"));
            conSQLServer.setPuerto(new Integer(cnnConfig.getString("Puerto")).intValue());

            conSQLServer.iniciarConexion();*/
        } catch (SQLException ex) {
            mensaje = "Error de conexión: " + ex.getMessage() + ". ref: Inicio.Main";
            System.out.println(mensaje);
            ex.printStackTrace();
        } catch (Exception ex) {
            mensaje = "Error Desconocido: " + ex.getMessage() + ". ref: Inicio.Main";
            System.out.println(mensaje);
            ex.printStackTrace();
        }
//        new Estudiantes(mensaje).setVisible(true);
/*Periodo p = new Periodo();
        PeriodoBC pBC = new PeriodoBC();

        //p.setNombre("OCAS");
        new CatalogosBase(p, pBC).setVisible(true);*/

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Loteria1().setVisible(true);
            }
        });
    }
}
