package ejercicio9;
import java.util.Scanner;
public class Ejercicio9 {

        Scanner keyboard = new Scanner(System.in);
        EcuacionSegundoGrado ecuacionSegundoGrado = new EcuacionSegundoGrado();
        double[] soluciones;
        soluciones = ecuacionSegundoGrado.calcularSolucionEcuacion(4,2,1);
        System.out.println(java.util.Arrays.toString(soluciones));
    }
}