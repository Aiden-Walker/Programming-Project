package ejemplotablamultiplicar;

public class TablaMultiplicar {
    public void multiplicate(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * "+i+" = " + (number * i));
        }
    }
}
