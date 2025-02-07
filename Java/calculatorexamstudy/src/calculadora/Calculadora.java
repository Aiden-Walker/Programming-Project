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
    /*public int resta() {
        return num1 - num2;
    }*/
    public int resta(){
        int result;
        if(resta2())result = num1-num2;
        else result=num2-num1;
        return result;
    }
    public boolean resta2(){
        if(num1 >= num2)return true;
        else return false;
    }
    public Integer divide2(){
        if (num2==0) return null;
        int result = num1/num2;
        return result;
    }
    public int multiplica() {
            return num1 * num2;
    }
    public int divide() {
        return num1 / num2;
    }
}
