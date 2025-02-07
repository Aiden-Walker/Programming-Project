package ejercicio9;
import java.util.Scanner;
public class EcuacionSegundoGrado {
    static Scanner keyboard = new Scanner(System.in);
    public double[] calcularSolucionEcuacion(int coeficienteA, int coeficienteB, int coeficienteC){
        double[] soluciones;
        int x;
        int nega_x;
        int square;
        int data;
        //System.out.printf("Please type a positive number:");
        //coeficienteA = keyboard.nextInt();
        //System.out.printf("Please type another positive number:");
        //coeficienteB = keyboard.nextInt();
        //System.out.printf("Please type a final positive number:");
        //coeficienteC = keyboard.nextInt();
        data = (coeficienteB*coeficienteB)-4*coeficienteA*coeficienteC;
        square = (int) Math.sqrt(data);
        x = (-coeficienteB + square) / (2*coeficienteA);
        nega_x = (-coeficienteB - square) / (2*coeficienteA);
        if (x >= 0 && nega_x >=0) {
            System.out.println("The result has 2 squares");
        } else if (x >=0 || nega_x >=0) {
            System.out.println("The result has 1 square");
        }
        else {
            System.out.println("The result has no square");
        }
        double pos_solution = coeficienteA*(x*x)+(coeficienteB*x)+coeficienteC;
        double nega_solution = coeficienteA*(nega_x*nega_x)-(coeficienteB*nega_x)-coeficienteC;
        soluciones = new double[]{pos_solution, nega_solution};
        //System.out.println("The results are: "+soluciones);
        return soluciones;
    }
}
