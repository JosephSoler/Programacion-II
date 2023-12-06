import java.util.Scanner;
public class validar{
    public static void main(String[]args){
    Scanner entrada = new Scanner ( System.in );
int resultado = 0;
int aprobados = 0;
int reprobados = 0;
int contadorEstudiantes = 1;
int repetir = 5;

while ( contadorEstudiantes <=10 ){
    while ( repetir != 0 ){
    System.out.printf("Escriba el resultado (1 = aprobado, 2 = reprobado): ", contadorEstudiantes+1);
    resultado = entrada.nextInt();
    
    
    if ( resultado == 1){
    repetir = 0;
    }else if ( resultado == 2){
    repetir = 0;
    }
    else {
        System.out.println("Solo numeros 1 y 2 permitidos");
    }
   
    
    }
    
    if ( resultado == 1)
    aprobados++;
    else
    reprobados++;
    
    contadorEstudiantes++;
     
   
    repetir = 5;
    
    }
    System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);

    if (aprobados > 8)
   System.out.println( "Bono para el instructor" );

   entrada.close();
    }
}


