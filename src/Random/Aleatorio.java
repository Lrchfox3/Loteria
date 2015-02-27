/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

import Utileria.Moda;
import Utileria.Util;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * Genera un número de loteria
 * el número de loteria consta de 6 valores entre los valores del 1 al 33
 * @author lchinchilla
 */
public class Aleatorio {

    //valor máximo
    private static final int MAXVAL = 33;
    //Cantidad de valores que se pueden generar
    private static final int CANTVAL = 6;
    //Contiene una matriz de valores aleatorios, cada fila no presenta valores repetidos
    //EL tamaño de la matriz es CANTVAL * CANTVAL
    private Integer[][] valoresAleatorios = new Integer[CANTVAL][CANTVAL];
    //lista de los valores aleatorios que fueron generados
    private LinkedList<Integer> valoresGenerados = new LinkedList<Integer>();
    private Integer[] result = new Integer[CANTVAL];

    /**
     * Contructor por defecto
     */
    public Aleatorio() {
    }

    public Integer[] getResultado() {
        return result;
    }

    public Integer[] getResultadoOrdenado(boolean ASC) {
        Integer[] sortResult = new Integer[CANTVAL];
        LinkedList<Integer> ordenados = new LinkedList<Integer>();
        for (int i = 0; i < result.length; i++) {
            ordenados.add(result[i]);
        }
        if (ASC) {
            Collections.sort(ordenados);
        } else {
            Collections.sort(ordenados, Collections.reverseOrder());
        }
        for (int i = 0; i < ordenados.size(); i++) {
            sortResult[i] = ordenados.get(i);
        }
        return sortResult;
    }

    public String getStrResultado() {
        return printResultado(getResultadoOrdenado(true));
    }

    public void imprimirResultado() {
        System.out.println(printResultado(result));
    }

    public void imprimirResultado(Integer[] arreglo) {
        System.out.println(printResultado(arreglo));
    }

    private String printResultado(Integer[] arreglo) {
        String resultado = "";
        boolean menor = false;
        for (int i = 0; i < arreglo.length; i++) {

        menor = false;
            if (arreglo[i] >=1 && arreglo[i] <=9){
                menor = true;
            }
            resultado = resultado + (menor ? "0" : "") + arreglo[i] + " - ";
        }
        if (resultado.length() > 0) {
            resultado = resultado.substring(0, resultado.length() - 3);
        }
        return resultado;
    }

    /**
     * calcula el resultado o el numero de loteria
     */
    public void calcularResultado() {
        int repeticiones = 0;
        for (int j = 0; j < CANTVAL; j++) {
            generarValoresAleatorios(j);
        }

        do {
            Moda moda = new Moda(valoresGenerados);
            repeticiones = moda.getRepeticiones();
            Util.removerValoresDeLista(valoresGenerados, moda.getModa());
            if (Util.tieneEspacioArreglo(result)) {
                asignaraValorAResultado(moda.getModa());
            } else {
                break;
            }
        } while (repeticiones > 1);
        //verifica si el resultado incompleto
        if (!Util.tieneEspacioArreglo(result)) {
            int vacios = Util.espaciosArreglo(result);
            for (int i = 0; i < vacios; i++) {
                int cantValoresrestantes = valoresGenerados.size();
                int posAleatoria = (int) ((1 + Math.random() * cantValoresrestantes) - 1);
                asignaraValorAResultado(valoresGenerados.get(posAleatoria));
                Util.removerValoresDeLista(valoresGenerados, valoresGenerados.get(posAleatoria));
            }
        }
    }

    private void asignaraValorAResultado(Integer valor) {

        for (int i = 0; i < result.length; i++) {
            if (result[i] == null) {
                result[i] = valor;
                break;
            }
        }
    }

    /**
     * Genera valores aleatorios
     * @param index Indica que fila de la matriz se llenará con valores aleatorios sin repetir
     */
    private void generarValoresAleatorios(int index) {
        int i = 0, x = 0, y = 0;
        valoresAleatorios[index][0] = (int) (1 + Math.random() * MAXVAL);
        i++;
        while (i < CANTVAL) {
            valoresAleatorios[index][i] = (int) (1 + Math.random() * MAXVAL);
            while (y < i) {
                if (valoresAleatorios[index][y] == valoresAleatorios[index][i]) {
                    i--;
                }
                y++;
            }
            i++;
            y = 0;
        }
        i = 0;

        while (i < CANTVAL) {

            valoresGenerados.add( valoresAleatorios[index][i]  );
            i++;
        }
    }
}
