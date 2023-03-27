
/**
 *
 * @author Antonio Sard González
 */
public class Chuletas {
    
    public static int busquedaDicotomica(int[] vector, int num) {
        int principio, fin, mitad;

        principio = 0;
        fin = vector.length - 1;
        mitad = (principio + fin) / 2;
        while (num != vector[mitad] && principio != fin) {
            if (num > vector[mitad]) {
                principio = mitad + 1;
            } else if (num < vector[mitad]) {
                fin = mitad - 1;
            }
            mitad = (principio + fin) / 2;
        }
        if (num == vector[mitad]) {
            System.out.println(num + " se encuentra en la posición: " + mitad);
        } else {
            System.out.println("No se encuentra el número en la tabla.");
        }
        return mitad;
    }

    public static void ordenacionBurbuja(int[] vector, int num, int pos) {
        int fin;
        boolean desordenado;

        fin = vector.length;
        do {
            desordenado = false;
            for (pos = 0; pos < fin; pos++) {
                if (pos + 1 <= fin && vector[pos] > vector[pos + 1]) {
                    num = vector[pos + 1];
                    vector[pos + 1] = vector[pos];
                    vector[pos] = num;
                    desordenado = true;
                }
            }
            fin--;
        } while (desordenado);
    }

    public static void ordenacionIntercambio(int[] vector, int num, int posicion) {
        int i, lugar;

        for (i = 0; i < vector.length; i++) {
            num = vector[i];
            lugar = i;
            for (posicion = i; posicion < vector.length; posicion++) {
                if (vector[posicion] < num) {
                    num = vector[posicion];
                    lugar = posicion;
                }
            }
            vector[lugar] = vector[i];
            vector[i] = num;
        }
    }

    public static void introduceOrdenado(int[] vector, int num, int lugarActual, int fin) {
        int posicion;

        posicion = 0;
        while (posicion < fin && num >= vector[posicion]) {
            posicion++;
        }
        for (fin = fin; fin > posicion; fin--) {
            vector[fin] = vector[fin - 1];
        }
        vector[posicion] = num;
    }
    
    public static void muestraTabla(int[] vector) {
        int i, total;
        String linea;
        
        total = vector.length;
        linea = "";
        for (i = 0; i < total; i++) {
            linea += vector[i] + "\t";
        }//Fin Para
        System.out.println(linea);
    }
    
}
