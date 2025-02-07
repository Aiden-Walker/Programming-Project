package ejemplofor;

public class EjemploFor {
    public static void main(String[] args) {
        int numero = 4;
        int resultado = 0;
        /*for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero+"*"+i+"="+resultado);
        }*/
        int counter =1;
        do {
            resultado = numero * counter;
            System.out.println(numero+"*"+counter+"="+resultado);
            counter++;
        } while (counter <= 10);
    }
}
