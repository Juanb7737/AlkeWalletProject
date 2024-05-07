package Aplicacion;

import Cuentas.*;
import Monedas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación de un objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        // Creación de una cuenta corriente y una cuenta de ahorro.
        Cuenta cuentaCorriente = new CuentaCorriente();
        Cuenta cuentaAhorro = new CuentaAhorro();

        // Creación de diferentes tipos de monedas.
        Moneda pesoCLP = new PesoCLP();
        Moneda dolarUS = new DolarUS();
        Moneda euroEU = new EuroEU();

        // Bucle infinito para mantener la aplicación en ejecución hasta que el usuario decida salir.
        while (true) {
            // Menú de opciones para el usuario.
            System.out.println("1. Depositar en cuenta corriente");
            System.out.println("2. Retirar de cuenta corriente");
            System.out.println("3. Ver saldo de cuenta corriente");
            System.out.println("4. Depositar en cuenta de ahorro");
            System.out.println("5. Retirar de cuenta de ahorro");
            System.out.println("6. Ver saldo de cuenta de ahorro");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            // Switch para manejar la opción seleccionada por el usuario.
            switch (opcion) {
                case 1:
                    // Depositar en cuenta corriente.
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDepositoCC = scanner.nextDouble();
                    cuentaCorriente.depositar(pesoCLP, cantidadDepositoCC);
                    break;
                case 2:
                    // Retirar de cuenta corriente.
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiroCC = scanner.nextDouble();
                    cuentaCorriente.retirar(pesoCLP, cantidadRetiroCC);
                    break;
                case 3:
                    // Ver saldo de cuenta corriente.
                    System.out.println("Saldo: " + cuentaCorriente.getSaldo(pesoCLP));
                    break;
                case 4:
                    // Depositar en cuenta de ahorro.
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDepositoCA = scanner.nextDouble();
                    cuentaAhorro.depositar(pesoCLP, cantidadDepositoCA);
                    break;
                case 5:
                    // Retirar de cuenta de ahorro.
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiroCA = scanner.nextDouble();
                    cuentaAhorro.retirar(pesoCLP, cantidadRetiroCA);
                    break;
                case 6:
                    // Ver saldo de cuenta de ahorro.
                    System.out.println("Saldo: " + cuentaAhorro.getSaldo(pesoCLP));
                    break;
                case 7:
                    // Salir de la aplicación.
                    System.exit(0);
                    break;
                default:
                    // Opción no válida.
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}git add .