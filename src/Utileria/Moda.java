package Utileria;

import java.util.LinkedList;

/**
 * Realiza y devuelve el calculo estadistico MODA de una lista dada.
 * @author lchinchilla
 */
public class Moda {

    private int moda = 0;
    private int repeticiones = 0;

    /**
     * Constructor por defecto
     */
    public Moda() {
    }

    /**
     * Constructor con parametros, este calcula la MODA
     * @param lista lista de valores a los cuales se calculará la moda
     */
    public Moda(LinkedList<Integer> lista) {
        calcularModa(lista);
    }

    /**
     * Realiza el calculo estatdistico MODA de una lista dada.
     * @param lista lista de valores a los cuales se calculará la moda
     */
    public void calcularModa(LinkedList<Integer> lista) {
        int maximaVecesQueSeRepite = 0, m = 0, valuei = 0, valuej = 0;
        for (int i = 0; i < lista.size(); i++) {
            int vecesQueSeRepite = 0;
            for (int j = 0; j < lista.size(); j++) {
                valuei = lista.get(i).intValue();
                valuej = lista.get(j).intValue();
                if (valuei == valuej) {
                    vecesQueSeRepite++;
                }
            }
            if (vecesQueSeRepite > maximaVecesQueSeRepite) {
                valuei = lista.get(i).intValue();
                m = valuei;
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }
        }
        setModa(m);
        setRepeticiones(maximaVecesQueSeRepite);
    }

    public int getModa() {
        return moda;
    }

    public void setModa(int moda) {
        this.moda = moda;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repiticiones) {
        this.repeticiones = repiticiones;
    }
}
