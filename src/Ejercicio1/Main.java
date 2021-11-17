package Ejercicio1;

import java.util.Random;

/*
1)	Se desea calcular la media, el máximo y el mínimo de un conjunto de 20 vectores de 1 millón de posiciones
cada uno. Cada vector contendrá números enteros aleatorios entre 1 y 10.000. Construir los vectores en el hilo
principal y crear un hilo para realizar los cálculos de cada vector.
Cada hilo deberá mostrar sus resultados en consola.
 */
public class Main {
    private static final int LONGITUD_ARRAY=100;
    private static final int MIN=1;
    private static final int MAX=10000;


    public static void main(String[] args) {

        for(int i=0; i<20; i++){
            int[] vector = new int[LONGITUD_ARRAY];
            numerosAleatorios(vector);
            CalcularEstadistica oCalculosEstadistica = new CalcularEstadistica(vector,i);
            Thread thread = new Thread(oCalculosEstadistica);
            thread.start();
         //   oCalculosEstadistica.run();
        }
    }

    private static void numerosAleatorios(int[] vector){
        Random random = new Random();
        int value=0;
        for(int i=0; i<LONGITUD_ARRAY; i++){
            value=random.nextInt(MAX-MIN+1)+MIN;
            vector[i]=value;
        }
    }
}
