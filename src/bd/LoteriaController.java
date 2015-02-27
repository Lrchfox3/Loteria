/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import DTO.NumeroGenerado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class LoteriaController extends CnnBD {

    public LoteriaController() {
    }

    public boolean editarNumeroGenerado(int accion, NumeroGenerado dto) throws SQLException {
        String sql = "";
        PreparedStatement pstr = null;
        if (accion == CnnBD.ACCION_INSERT) {
            sql = "INSERT INTO NUMERO_GENERADO(numero, fecha, repeticion) VALUES(?,?,?)";
            pstr = super.getCnn().prepareStatement(sql);
            pstr.setString(1, dto.getNumero());
            pstr.setTimestamp(2, new java.sql.Timestamp(dto.getFecha().getTime()));
            pstr.setInt(3, dto.getRepeticion());
            pstr.executeUpdate();
            super.getCnn().commit();
        } else if (accion == CnnBD.ACCION_UPDATE) {
            sql = "UPDATE NUMERO_GENERADO SET numero = ? WHERE codigo = ?";
            pstr = super.getCnn().prepareStatement(sql);
            pstr.setString(1, dto.getNumero());
            pstr.setInt(5, dto.getCodigo());
            pstr.executeUpdate();
            super.getCnn().commit();
        } else if (accion == CnnBD.ACCION_DELETE) {
            sql = "DELETE FROM NUMERO_GENERADO WHERE codigo = ?";
            pstr = super.getCnn().prepareStatement(sql);
            pstr.setInt(1, dto.getCodigo());
            pstr.executeUpdate();
            super.getCnn().commit();
        }

        if (pstr != null) {
            pstr.close();
        }
        return true;
    }

    public boolean editarNumeroSorteado(int accion, NumeroGenerado dto) throws SQLException {
        String sql = "";
        PreparedStatement pstr = null;
        if (accion == CnnBD.ACCION_INSERT) {
            sql = "INSERT INTO NUMERO_SORTEO(numero,fecha) VALUES(?,?)";
            pstr = super.getCnn().prepareStatement(sql);
            pstr.setString(1, dto.getNumero());
            pstr.setTimestamp(2, new java.sql.Timestamp(dto.getFecha().getTime()));
            pstr.executeUpdate();
            super.getCnn().commit();
        } else if (accion == CnnBD.ACCION_UPDATE) {
            sql = "UPDATE NUMERO_SORTEO SET numero = ? WHERE codigo = ?";
            pstr = super.getCnn().prepareStatement(sql);
            pstr.setString(1, dto.getNumero());
            pstr.setInt(5, dto.getCodigo());
            pstr.executeUpdate();
            super.getCnn().commit();
        } else if (accion == CnnBD.ACCION_DELETE) {
            sql = "DELETE FROM NUMERO_SORTEO WHERE codigo = ?";
            pstr = super.getCnn().prepareStatement(sql);
            pstr.setInt(1, dto.getCodigo());
            pstr.executeUpdate();
            super.getCnn().commit();
        }

        if (pstr != null) {
            pstr.close();
        }
        return true;
    }

    /**
     * Ejecuta las estadisticas de loteria
     *
     * @throws oracle.jbo.JboException
     * @return Devuelve listados con los números de loteria sacados de
     * estadistica
     * @param sql Sentencia SQL que devuelve el valor unico
     * @param dbTransaction Conexón abierta pata ejecutar sentencia al manejador
     * de BDD
     */
    public List<String> generarEstadisticas(int tipo) throws SQLException {
        List<String> numeros = new ArrayList<String>();        
            Statement stmt = null;
            ResultSet rs = null;
            stmt = super.getCnn().createStatement();
            rs = stmt.executeQuery("SELECT numero FROM V_ESTADISTICA where tipo = " + tipo +" order by numero");
            while (rs.next()) {
                numeros.add( rs.getString("numero"));
            }
            // Sin importar que pasó se debe cerrar el resultset y el statement.
            if (rs != null) {
                rs.close();
            }

            if (stmt != null) {
                stmt.close();
            }        
        return numeros;
    }
}
