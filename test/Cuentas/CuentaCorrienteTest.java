package Cuentas;

import Cuentas.CuentaCorriente;
import Monedas.Moneda;
import Monedas.PesoCLP;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CuentaCorrienteTest {

    @Test
    public void testDepositar() {
        CuentaCorriente cuenta = new CuentaCorriente();
        Moneda pesoCLP = new PesoCLP();
        cuenta.depositar(pesoCLP, 1000);
        assertEquals(1000, cuenta.getSaldo(pesoCLP));
    }

    @Test
    public void testRetirar() {
        CuentaCorriente cuenta = new CuentaCorriente();
        Moneda pesoCLP = new PesoCLP();
        cuenta.depositar(pesoCLP, 1000);
        cuenta.retirar(pesoCLP, 500);
        assertEquals(500, cuenta.getSaldo(pesoCLP));
    }

    @Test
    public void testRetirarSaldoInsuficiente() {
        CuentaCorriente cuenta = new CuentaCorriente();
        Moneda pesoCLP = new PesoCLP();
        cuenta.depositar(pesoCLP, 1000);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(pesoCLP, 1500));
    }
}