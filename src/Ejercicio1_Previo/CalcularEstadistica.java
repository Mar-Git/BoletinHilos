package Ejercicio1_Previo;

public class CalcularEstadistica {

    private int[] vector;
    private int idHilo;

    public CalcularEstadistica(int[] vector, int idHilo){
        this.vector=vector;
        this.idHilo=idHilo;
    }

    public void setIdHilo(int idHilo) {
        this.idHilo = idHilo;
    }
    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public void calculos(){
        double media=0;
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        long auxParaMedia=0;

        for (int num:vector) {
            if(num>max) {
                max=num;
            }
            if(num<min){
                min=num;
            }
            auxParaMedia+=num;
        }
        media=(double)auxParaMedia/vector.length;

        System.out.println("Soy el hilo: "+idHilo);
        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);
        System.out.println("La media es: "+media);
    }


}
