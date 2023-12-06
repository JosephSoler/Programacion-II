import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);
       
        // muestra el saldo inicial de cada objeto
        //System.out.printf("\n\nSaldo de %s: $%.2f%n",
        //cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        //System.out.printf("\n\nSaldo de %s: $%.2f%n%n",
       // cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        mostrarCuenta(cuenta1, cuenta2);
        // crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador (promt)
        double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
                montoDeposito);
        cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1

        // muestra los saldos
           mostrarCuenta(cuenta1, cuenta2);
      //  System.out.printf("Saldo de %s: $%.2f%n",
      //  cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
     //   System.out.printf("Saldo de %s: $%.2f%n%n",
     //   cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        System.out.print("Escriba el monto a depositar para cuenta2:"); // indicador (promt)
        montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",
                montoDeposito);
        cuenta2.depositar(montoDeposito); // suma al saldo de cuenta2

        // muestra los saldos
          mostrarCuenta(cuenta1, cuenta2);
       // System.out.printf("Saldo de %s: $%.2f%n",
      //  cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
       // System.out.printf("Saldo de %s: $%.2f%n%n",
        //cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        // Parte del ejercicio 3.11

        System.out.printf("Escriba el monto a retirar en la cuenta1: "); // indicador (promt)
        double retiro = entrada.nextDouble(); // obtiene entrada del usuario
        cuenta1.retirar(retiro);
      

        if (retiro < cuenta1.obtenretiro()) {

            System.out.printf("%nSe le resta %.2f al saldo de cuenta1%n%n",
                    retiro);
            cuenta1.retirar(retiro); // resta al saldo de cuenta1

            System.out.printf("Saldo de %s: $%.2f%n%n",
            cuenta1.obtenerNombre(), cuenta1.obtenretiro());

        }

        if (retiro > cuenta1.obtenretiro()) {

            System.out.println("El monto a retirar excede el saldo de la cuenta. \n\n");
        }

    
        System.out.printf("Escriba el monto a retirar en la cuenta2: "); // indicador (promt)
        retiro = entrada.nextDouble(); // obtiene entrada del usuario
        cuenta2.retirar(retiro);
      

        if (retiro < cuenta2.obtenretiro()) {

            System.out.printf("%nSe le resta %.2f al saldo de cuenta2%n%n",
                    retiro);
            cuenta2.retirar(retiro); // resta al saldo de cuenta1

            System.out.printf("Saldo de %s: $%.2f%n%n",
            cuenta2.obtenerNombre(), cuenta2.obtenretiro());

        }

        if (retiro > cuenta2.obtenretiro()) {

            System.out.println("El monto a retirar excede el saldo de la cuenta. \n\n");

        }


        entrada.close();
    

    } // fin de main

public static void mostrarCuenta(Cuenta cuenta1, Cuenta cuenta2)
{  
      
      
      System.out.printf("\n\nSaldo de %s: $%.2f%n",
     cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
      System.out.printf("\n\nSaldo de %s: $%.2f%n%n",
     cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());     
    
}

} 
