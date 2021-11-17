package Ejercicio2;

import Ejercicio1.CalcularEstadistica;

import java.util.Random;

/*
2)	Modificar el programa anterior para que el programa principal nos solicite un tiempo máximo en mili segundos
que deseamos esperar para que se realicen los cálculos. Una vez transcurridos y si los cálculos no han
finalizado, deberá ordenar la finalización de todos los hilos. Posteriormente cuando haya comprobado que todos
los hilos han finalizado, deberá mostrar en consola “Cálculos cancelados, proceso de cálculo demasiado lento.”2)	Modificar el programa anterior para que el programa principal nos solicite un tiempo máximo en mili segundos que deseamos esperar para que se realicen los cálculos. Una vez transcurridos y si los cálculos no han finalizado, deberá ordenar la finalización de todos los hilos. Posteriormente cuando haya comprobado que todos los hilos han finalizado, deberá mostrar en consola “Cálculos cancelados, proceso de cálculo demasiado lento.”
 */
public class Main_Ejercicio2 {
    private static final int LONGITUD_ARRAY=100;
    private static final int MIN=1;
    private static final int MAX=10000;


    public static void main(String[] args) {

        for(int i=0; i<20; i++){
            int[] vector = new int[LONGITUD_ARRAY];
            numerosAleatorios(vector);
            Ejercicio1.CalcularEstadistica oCalculosEstadistica = new CalcularEstadistica(vector,i);
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
