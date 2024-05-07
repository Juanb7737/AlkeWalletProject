package Monedas;

import Monedas.PesoCLP;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PesoCLPTest {

    @Test
    public void testDepositar() {
        PesoCLP pesoCLP = new PesoCLP();
        pesoCLP.depositar(1000);
        assertEquals(1000, pesoCLP.getValor());
    }

    @Test
    public void testRetirar() {
        PesoCLP pesoCLP = new PesoCLP();
        pesoCLP.depositar(1000);
        pesoCLP.retirar(500);
        assertEquals(500, pesoCLP.getValor());
    }

    @Test
    public void testRetirarSaldoInsuficiente() {
        PesoCLP pesoCLP = new PesoCLP();
        pesoCLP.depositar(1000);
        assertThrows(IllegalArgumentException.class, () -> pesoCLP.retirar(1500));
    }
}