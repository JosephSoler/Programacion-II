import java.util.Scanner;

public class limite
{  

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int SaldoInicial,cargos,creditos,limiteCredict,saldo;
        int r;
        String Ncuenta;
        System.out.println("Ingrese numero de cuenta: ");
        Ncuenta=entrada.next();
        System.out.println("Ingrese el saldo inicial del mes: ");
        SaldoInicial=entrada.nextInt();
        System.out.println("Ingrese el total de todos los articulos cargados por el cliente en el mes: ");
        cargos=entrada.nextInt();
        System.out.println("Ingrese el total de todos los creditos aplicados a la cuenta del cliente en el mes: ");
        creditos=entrada.nextInt();
        System.out.println("Ingrese el limite de credito permitido: ");
        limiteCredict=entrada.nextInt();

saldo=SaldoInicial+cargos-creditos;
r=limiteCredict-saldo;
if (limiteCredict<saldo)
    System.out.println("La cuenta: "+ Ncuenta + " Se excedio el limite de su credito");
else
    System.out.println("No puede exeder de: "+ r);


    entrada.close();
    }
}