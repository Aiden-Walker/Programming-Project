package returndate;

import org.junit.Test;
import org.junit.Assert.*;
import static org.junit.Assert.assertSame;

public class FechaTest {

    @Test
    public void devuelveFechaCase1() {
        Fecha fecha = new Fecha();
        String result=fecha.DevuelveFecha(1);
        assertSame(result, fecha.DevuelveFecha(1));
    }
    @Test
    public void devuelveFechaCase2() {
        Fecha fecha = new Fecha();
        String result=fecha.DevuelveFecha(2);
        assertSame(result, fecha.DevuelveFecha(2));
    }
}