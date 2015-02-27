/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;

/**
 *
 * @author lchinchilla
 */
public class CnnBD {

    public static Connection cnn = null;
    private static int accion = 0;
    public static final int ACCION_NINGUNA = 0;
    public static final int ACCION_INSERT = 1;
    public static final int ACCION_UPDATE = 2;
    public static final int ACCION_DELETE = 3;

    public static Connection getCnn() {
        return cnn;
    }

    public static void setCnn(Connection _cnn) {
        cnn = _cnn;        
    }

    /**
     * @return the accion
     */
    public static int getAccion() {
        return accion;
    }

    /**
     * @param aAccion the accion to set
     */
    public static void setAccion(int aAccion) {
        accion = aAccion;
    }

    public static String getDescripcionAccion() {
        int action = getAccion();
        String descripcion = "";
        switch (action) {
            case ACCION_NINGUNA:
                descripcion = "Ninguna";
                break;
            case ACCION_INSERT:
                descripcion = "Agregar";
                break;
            case ACCION_UPDATE:
                descripcion = "Editar";
                break;
            case ACCION_DELETE:
                descripcion = "Eliminar";
                break;
            default:
                descripcion = "Ninguna";
                break;

        }
        return descripcion;
    }

    public static String getDescripcionAccion(int action) {
        String descripcion = "";
        switch (action) {
            case ACCION_NINGUNA:
                descripcion = "Ninguna";
                break;
            case ACCION_INSERT:
                descripcion = "Agregar";
                break;
            case ACCION_UPDATE:
                descripcion = "Editar";
                break;
            case ACCION_DELETE:
                descripcion = "Eliminar";
                break;
            default:
                descripcion = "Ninguna";
                break;

        }
        return descripcion;
    }
}
