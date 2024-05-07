package Cuentas;

import Monedas.*;

// La clase CuentaCorriente cumple con el principio de responsabilidad única (SRP)
// ya que solo se encarga de las operaciones relacionadas con una cuenta corriente.
public class CuentaCorriente implements Cuenta {
    // Las monedas en las que se puede manejar la cuenta corriente.
    private Moneda pesoCLP;
    private Moneda dolarUS;
    private Moneda euroEU;

    // En el constructor se inicializan las monedas que se pueden manejar en la cuenta.
    public CuentaCorriente() {
        pesoCLP = new PesoCLP();
        dolarUS = new DolarUS();
        euroEU = new EuroEU();
    }

    // Método para depositar una cantidad en la cuenta corriente.
    // La moneda y la cantidad a depositar son proporcionadas como argumentos.
    @Override
    public void depositar(Moneda moneda, double cantidad) {
        moneda.depositar(cantidad);
    }

    // Método para retirar una cantidad de la cuenta corriente.
    // La moneda y la cantidad a retirar son proporcionadas como argumentos.
    @Override
    public void retirar(Moneda moneda, double cantidad) {
        moneda.retirar(cantidad);
    }

    // Método para obtener el saldo de la cuenta corriente en una moneda específica.
    // La moneda para la que se desea el saldo es proporcionada como argumento.
    @Override
    public double getSaldo(Moneda moneda) {
        return moneda.getValor();
    }
}