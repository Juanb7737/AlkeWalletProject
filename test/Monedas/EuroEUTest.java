package Monedas;

import Monedas.EuroEU;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EuroEUTest {

    @Test
    public void testDepositar() {
        EuroEU euroEU = new EuroEU();
        euroEU.depositar(1000);
        assertEquals(1000, euroEU.getValor());
    }

    @Test
    public void testRetirar() {
        EuroEU euroEU = new EuroEU();
        euroEU.depositar(1000);
        euroEU.retirar(500);
        assertEquals(500, euroEU.getValor());
    }

    @Test
    public void testRetirarSaldoInsuficiente() {
        EuroEU euroEU = new EuroEU();
        euroEU.depositar(1000);
        assertThrows(IllegalArgumentException.class, () -> euroEU.retirar(1500));
    }
}