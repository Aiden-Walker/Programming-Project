package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args) {
        // Declaracion de variables
        int numeroTabla = 0;
        int limiteTabla = 0;
        Scanner teclado = new Scanner(System.in);
        // Proceso
        // Toma de datos
        // Lectura del numero de la tabla
        System.out.print("Ingrese el numero de la tabla a multiplicar: ");
        numeroTabla = teclado.nextInt();
        // Lectura del limite maximo del contador a multiplicar
        System.out.println("Introduzca el limite maxido de contador a multipliar: ");
        limiteTabla = teclado.nextInt();
        while(numeroTabla >0 && limiteTabla >0){
            // Imprimir la tabla correspondiente
            for(int i = 1; i <= limiteTabla; i++){
                System.out.println(numeroTabla+"*"+i+"="+(numeroTabla*i));
            }
            // Repetimos toma de datos
            // Lectura del numero de la tabla
            System.out.print("Ingrese el numero de la tabla a multiplicar: ");
            numeroTabla = teclado.nextInt();
            // Lectura del limite maximo del contador a multiplicar
            System.out.println("Introduzca el limite maxido de contador a multipliar: ");
            limiteTabla = teclado.nextInt();
        }
    }
}
