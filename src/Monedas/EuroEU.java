package Monedas;

// La clase EuroEU cumple con el principio de responsabilidad única (SRP)
// ya que solo se encarga de las operaciones relacionadas con la moneda EuroEU.
public class EuroEU implements Moneda {
    // El saldo actual de la moneda EuroEU.
    private double saldo;

    // Método para obtener el valor actual del saldo en EuroEU.
    @Override
    public double getValor() {
        return saldo;
    }

    // Método para depositar una cantidad en EuroEU.
    // La cantidad a depositar es proporcionada como argumento.
    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    // Método para retirar una cantidad en EuroEU.
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