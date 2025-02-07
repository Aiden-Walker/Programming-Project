package calculadora;

public class Calculadora {
    private int num1;
    private int num2;
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int suma() {
        return num1 + num2;
    }
    public int resta() {
        return num1 - num2;
    }
    public int multiplica() {
            return num1 * num2;
    }
    public int divide() {
        return num1 / num2;
    }
}
