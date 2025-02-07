package calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void suma() {
        Calculadora calculadora = new Calculadora(10, 20);
        int resultado = calculadora.suma();
        assertEquals(30, resultado);
    }

    @Test
    public void resta() {
        fail("Not yet implemented");
    }

    @Test
    public void multiplica() {
        fail("Not yet implemented");
    }

    @Test
    public void divide() {
        fail("Not yet implemented");
    }
}