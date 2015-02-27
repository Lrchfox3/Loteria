/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utileria;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Administrador
 */
public class Util {

    /**
     * indica si existe alguna casilla vacia del arreglo.
     * @return devuelve verdadero si existe una casilla vacía
     */
    public static boolean tieneEspacioArreglo(Integer[] arreglo) {
        boolean tiene = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                tiene = true;
                break;
            }
        }
        return tiene;
    }

        /**
     * indica la cantidad casillas vacias del arreglo.
     * @return devuelve la cantidad de casillas vacias
     */
    public static int espaciosArreglo(Integer[] arreglo) {
        int vacias = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                vacias++;
            }
        }
        return vacias;
    }

    /**
     * remover todos los valores que coincidan con un valor especificado de una lista
     * @param lista lista de valores en la cual se hará la búsqueda del valor
     * @param value es el valor que será buscado en la lista
     * @return devuelve verdadero si los valores fueron eliminados de la lista
     */
    public static boolean removerValoresDeLista(LinkedList<Integer> lista, Integer value) {
        return removerValorDeLista(lista, value, true);
    }

    /**
     * remover un valor existente de una lista
     * @param lista lista de valores en la cual se hará la búsqueda del valor
     * @param value es el valor que será buscado en la lista
     * @param todos indica si se deben remover todas las coincidencias de la lista.
     *              en casoq eu sea falso, solo se eliminará la primera coincidencia
     * @return devuelve verdadero si el valor fue eliminado de la lista
     */
    public static boolean removerValorDeLista(LinkedList<Integer> lista, Integer value) {
        return removerValorDeLista(lista, value, false);
    }

    /**
     * remover lo(s) valor(es) que coincidan con un valor espeficicado, existentes en una lista.
     * @param lista lista de valores en la cual se hará la búsqueda del valor
     * @param value es el valor que será buscado en la lista
     * @param todos indica si se deben remover todas las coincidencias de la lista.
     *              en caso que sea falso, solo se eliminará la primera coincidencia
     * @return devuelve verdadero si el valor fue eliminado de la lista
     */
    private static boolean removerValorDeLista(LinkedList<Integer> lista, Integer value, boolean todos) {
        boolean retValue = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == value) {
                lista.remove(i);
                if (!todos) {
                    break;
                }
                retValue = true;
            }
        }
        return retValue;
    }
    
        // lrch.Utilitarios.Utileria.obtieneValorString(cnn, "SELECT CURRENT_TIMESTAMP AS VALOR");
    
}
