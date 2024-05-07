package Cuentas;

import Monedas.Moneda;
import Monedas.PesoCLP;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CuentaTest {

    private class CuentaFicticia implements Cuenta {
        private Moneda moneda;

        public CuentaFicticia(Moneda moneda) {
            this.moneda = moneda;
        }

        @Override
        public void depositar(Moneda moneda, double cantidad) {
            moneda.depositar(cantidad);
        }

        @Override
        public void retirar(Moneda moneda, double cantidad) {
            moneda.retirar(cantidad);
        }

        @Override
        public double getSaldo(Moneda moneda) {
            return moneda.getValor();
        }
    }

    @Test
    void depositar() {
        Moneda pesoCLP = new PesoCLP();
        Cuenta cuenta = new CuentaFicticia(pesoCLP);
        cuenta.depositar(pesoCLP, 1000);
        assertEquals(1000, cuenta.getSaldo(pesoCLP));
    }

    @Test
    void retirar() {
        Moneda pesoCLP = new PesoCLP();
        Cuenta cuenta = new CuentaFicticia(pesoCLP);
        cuenta.depositar(pesoCLP, 1000);
        cuenta.retirar(pesoCLP, 500);
        assertEquals(500, cuenta.getSaldo(pesoCLP));
    }

    @Test
    void getSaldo() {
        Moneda pesoCLP = new PesoCLP();
        Cuenta cuenta = new CuentaFicticia(pesoCLP);
        cuenta.depositar(pesoCLP, 1000);
        assertEquals(1000, cuenta.getSaldo(pesoCLP));
    }
}