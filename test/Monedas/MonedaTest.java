package Monedas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MonedaTest {

    private class MonedaFicticia implements Moneda {
        private double saldo;

        @Override
        public double getValor() {
            return saldo;
        }

        @Override
        public void depositar(double cantidad) {
            saldo += cantidad;
        }

        @Override
        public void retirar(double cantidad) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
            } else {
                throw new IllegalArgumentException("Saldo insuficiente");
            }
        }
    }

    @Test
    void depositar() {
        Moneda moneda = new MonedaFicticia();
        moneda.depositar(1000);
        assertEquals(1000, moneda.getValor());
    }

    @Test
    void retirar() {
        Moneda moneda = new MonedaFicticia();
        moneda.depositar(1000);
        moneda.retirar(500);
        assertEquals(500, moneda.getValor());
    }

    @Test
    void getValor() {
        Moneda moneda = new MonedaFicticia();
        moneda.depositar(1000);
        assertEquals(1000, moneda.getValor());
    }
}