import java.util.Scanner;

public class Asteriscos

{     

public static void main( String args[])
{     
System.out.print("\nEste programa recibe un entero e imprime ");
System.out.println("un cuadrado de asteriscos con ese numero de lado.");

int lado;
Scanner entrada = new Scanner(System.in);
asteriscos miObjeto = new asteriscos();

System.out.println("\nPor favor introduzca un entero: ");
lado = entrada.nextInt();

miObjeto.Cuadrado(lado);
  
}     
} 