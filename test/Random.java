/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedList;

/**
 *
 * @author chinchillal
 */
public class Random {

    private static final int MAXVAL = 33;
    private static final int MAXNUM = 6;
    private Integer[][] values = new Integer[MAXNUM][MAXNUM];
    private LinkedList<Integer> valoresGenerados = new LinkedList<Integer>();
    private Integer[] result = new Integer[MAXNUM];

    public static void main(String[] args) {
        Random r = new Random();
        for (int j = 0; j < MAXNUM; j++) {
            r.generarPosiblesValores(j);
        }
        r.obtenerModa();
    }

    public void obtenerModa() {
        int veces = 0;
        do {
            Integer[] moda = moda();
            veces = moda[1];
            removerDeLista(moda[0]);
            if (sinEspacio()) {
                asignaraResultado(moda[0]);
            } else {
                break;
            }
        } while (veces > 1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " - ");

        }
    }

    private void asignaraResultado(Integer valor) {

        for (int i = 0; i < result.length; i++) {
            if (result[i] == null) {
                result[i] = valor;
                break;
            }
        }
    }

    private boolean sinEspacio() {
        boolean tiene = false;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == null) {
                tiene = true;
                break;
            }
        }
        return tiene;
    }

    private void removerDeLista(Integer value) {
        for (int i = 0; i < valoresGenerados.size(); i++) {
            if (valoresGenerados.get(i) == value) {
                valoresGenerados.remove(i);
            }
        }
    }

    public void generarPosiblesValores(int index) {

        int i = 0, x = 0, y = 0;
        values[index][0] = (int) (1 + Math.random() * MAXVAL);
        i++;
        while (i < MAXNUM) {
            values[index][i] = (int) (1 + Math.random() * MAXVAL);
            while (y < i) {
                if (values[index][y] == values[index][i]) {
                    i--;
                }
                y++;
            }
            i++;
            y = 0;
        }
        i = 0;
        while (i < MAXNUM) {
            valoresGenerados.add(values[index][i]);
            System.out.print(values[index][i] + " - ");
            i++;
        }
        System.out.println("");
    }

    public Integer[] moda() {

        int maximaVecesQueSeRepite = 0;
        Integer[] resultado = new Integer[2];
        int moda = 0;
        int valuei = 0, valuej = 0;
        for (int i = 0; i < valoresGenerados.size(); i++) {
            int vecesQueSeRepite = 0;
            for (int j = 0; j < valoresGenerados.size(); j++) {
                valuei = valoresGenerados.get(i).intValue();
                valuej = valoresGenerados.get(j).intValue();
                if (valuei == valuej) {
                    vecesQueSeRepite++;
                }
            }
            if (vecesQueSeRepite > maximaVecesQueSeRepite) {
                valuei = valoresGenerados.get(i).intValue();
                moda = valuei;
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }
        }

        System.out.println("La moda es " + moda + " y se repitió " + maximaVecesQueSeRepite + " veces.");
        resultado[0] = moda;
        resultado[1] = maximaVecesQueSeRepite;
        return resultado;
    }
}

