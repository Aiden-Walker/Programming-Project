package utilities;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class UtilitiesEN {
    public int readInteger(String message) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(message);
        return keyboard.nextInt();
    }
    public String readString(String message) throws IOException {
        String chain;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print(message);
        chain = br.readLine();
        return chain;
    }
}