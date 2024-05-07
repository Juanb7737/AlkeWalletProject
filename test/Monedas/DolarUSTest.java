package Monedas;

import Monedas.DolarUS;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DolarUSTest {

    @Test
    public void testDepositar() {
        DolarUS dolarUS = new DolarUS();
        dolarUS.depositar(1000);
        assertEquals(1000, dolarUS.getValor());
    }

    @Test
    public void testRetirar() {
        DolarUS dolarUS = new DolarUS();
        dolarUS.depositar(1000);
        dolarUS.retirar(500);
        assertEquals(500, dolarUS.getValor());
    }

    @Test
    public void testRetirarSaldoInsuficiente() {
        DolarUS dolarUS = new DolarUS();
        dolarUS.depositar(1000);
        assertThrows(IllegalArgumentException.class, () -> dolarUS.retirar(1500));
    }
}