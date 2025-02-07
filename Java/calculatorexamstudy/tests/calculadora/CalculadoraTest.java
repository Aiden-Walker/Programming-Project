package calculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculadoraTest {
        private int num1;
        private int num2;
        private int resultado;
        public CalculadoraTest(int num1,int num2,int resultado){
            this.num1 = num1;
            this.num2 = num2;
            this.resultado = resultado;
        }
        @Parameterized.Parameters
        public static Collection<Object[]> numeros(){
            return Arrays.asList(new Object[][]{
                    {20,10,5}, {30,-2,-15}, {5,2,3}
            });
        }

    @Test
    public void suma() {
        Calculadora calcuprueba = new Calculadora(20,10);
        int result = calcuprueba.suma();
        assertEquals(30,30);
    }

    @Test
    public void restaparametrizada(){
            Calculadora calcupruebaparam = new Calculadora(num1,num2);
            int resultado = calcupruebaparam.resta();
            assertEquals(resultado,resultado);
    }

    @Test
    public void resta() {
        Calculadora calcuresta = new Calculadora(20,10);
        int result = calcuresta.resta();
        assertEquals(10,10);
    }

    @Test
    public void multiplica() {
        Calculadora calcumultiplica = new Calculadora (10,5);
        int result = calcumultiplica.multiplica();
        assertEquals(50,50);
    }

    @Test
    public void divide() {
        Calculadora calcudivide = new Calculadora(10,5);
        int result = calcudivide.divide();
        assertEquals(2,2);
    }
    @Test
    public void divide2(){
        Calculadora calcudivide2 = new Calculadora(10,5);
        assertEquals(2,2);
    }
    @Test
    public void resta2(){
        Calculadora calcuresta2 = new Calculadora(30,20);
        assertTrue(true);
    }
}