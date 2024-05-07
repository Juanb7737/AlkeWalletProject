package Cuentas;

import Cuentas.CuentaAhorro;
import Monedas.Moneda;
import Monedas.PesoCLP;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CuentaAhorroTest {

    @Test
    public void testDepositar() {
        CuentaAhorro cuenta = new CuentaAhorro();
        Moneda pesoCLP = new PesoCLP();
        cuenta.depositar(pesoCLP, 1000);
        assertEquals(1000, cuenta.getSaldo(pesoCLP));
    }

    @Test
    public void testRetirar() {
        CuentaAhorro cuenta = new CuentaAhorro();
        Moneda pesoCLP = new PesoCLP();
        cuenta.depositar(pesoCLP, 1000);
        cuenta.retirar(pesoCLP, 500);
        assertEquals(500, cuenta.getSaldo(pesoCLP));
    }

    @Test
    public void testRetirarSaldoInsuficiente() {
        CuentaAhorro cuenta = new CuentaAhorro();
        Moneda pesoCLP = new PesoCLP();
        cuenta.depositar(pesoCLP, 1000);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(pesoCLP, 1500));
    }
}