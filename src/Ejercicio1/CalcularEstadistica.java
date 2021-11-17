package Ejercicio1;

public class CalcularEstadistica implements Runnable{

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

    @Override
    public void run(){
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

        System.out.printf("Soy el hilo: %d. El maximo es: %d\n",idHilo,max);
        System.out.printf("Soy el hilo: %d. El maximo es: %d\n",idHilo,min);
        System.out.printf("La media es: %f\n",media);
    }


}
