package Monedas;

// La interfaz Moneda cumple con el principio de segregación de interfaces (ISP)
// ya que solo contiene los métodos que son específicos para una moneda.
public interface Moneda {
    // Método para obtener el valor actual del saldo en una moneda específica.
    double getValor();

    // Método para depositar una cantidad en una moneda específica.
    // La cantidad a depositar es proporcionada como argumento.
    void depositar(double cantidad);

    // Método para retirar una cantidad en una moneda específica.
    // La cantidad a retirar es proporcionada como argumento.
    void retirar(double cantidad);
}