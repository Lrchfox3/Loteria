/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

import java.sql.Date;

/**
 *
 * @author Administrador
 */
public class NumeroGenerado {
    
    private Integer codigo = null;
    private String numero = null;
    private Date fecha = null;
    private Integer repeticion = null;


    public NumeroGenerado(){

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getRepeticion() {
        return repeticion;
    }

    public void setRepeticion(Integer repeticion) {
        this.repeticion = repeticion;
    }


}