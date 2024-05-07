package Cuentas;

import Monedas.Moneda;

// La interfaz Cuenta cumple con el principio de segregación de interfaces (ISP)
// ya que solo contiene los métodos que son específicos para una cuenta.
public interface Cuenta {
    // Método para depositar una cantidad en una cuenta.
    // La moneda y la cantidad a depositar son proporcionadas como argumentos.
    void depositar(Moneda moneda, double cantidad);

    // Método para retirar una cantidad de una cuenta.
    // La moneda y la cantidad a retirar son proporcionadas como argumentos.
    void retirar(Moneda moneda, double cantidad);

    // Método para obtener el saldo de una cuenta en una moneda específica.
    // La moneda para la que se desea el saldo es proporcionada como argumento.
    double getSaldo(Moneda moneda);
}