package array;

public class EjArrays {
    public static void main(String[] args) {
        int[] numeros = new int[4];// Devuelve la direccion de memoria de inicio del array
        int[] datos;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=i+1;
        }
        datos = numeros;
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Dato posicion: " +i+" : "+datos[i]);
        }
    }
}
