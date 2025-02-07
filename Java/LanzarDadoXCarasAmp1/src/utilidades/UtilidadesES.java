package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UtilidadesES {
    public int leeEntero(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensaje);
        return teclado.nextInt();
    }
    public String leeCadena(String mensaje) throws IOException {
        String cadena;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print(mensaje);
        cadena = br.readLine();
        return cadena;
    }
}
