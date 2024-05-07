package Monedas;

// La clase DolarUS cumple con el principio de responsabilidad única (SRP)
// ya que solo se encarga de las operaciones relacionadas con la moneda DolarUS.
public class DolarUS implements Moneda {
    // El saldo actual de la moneda DolarUS.
    private double saldo;

    // Método para obtener el valor actual del saldo en DolarUS.
    @Override
    public double getValor() {
        return saldo;
    }

    // Método para depositar una cantidad en DolarUS.
    // La cantidad a depositar es proporcionada como argumento.
    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    // Método para retirar una cantidad en DolarUS.
    // La cantidad a retirar es proporcionada como argumento.
    // Si la cantidad a retirar es mayor que el saldo actual, se lanza una excepción.
    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }
}