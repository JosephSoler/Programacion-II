import java.util.Scanner;

public class salario
{  

    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        double salarioB, Salario;
        int horas;
        int extras;
        String Nombre;
        int c=0;
        while (c<=2){
            System.out.println("Ingrese Nombre del empleado: ");
            Nombre=entrada.next();
            System.out.println("Ingrese Horas trabajadas: ");
            horas=entrada.nextInt();
            System.out.println("Ingrese precio de horas: ");
            Salario=entrada.nextDouble();
            
            if (horas<=40){
                salarioB = horas*Salario;
                System.out.println("Empleado: " +Nombre+" El total del sueldo bruto es: "+ salarioB);
            }
            if (horas>40){
                extras=horas-40;
                salarioB = 40*Salario + extras*(Salario + Salario/2);
                System.out.println("Empleado: " +Nombre+" El total del sueldo bruto es: "+ salarioB);
            }
            
           c++;

        }
        
        entrada.close();
        
    }
}