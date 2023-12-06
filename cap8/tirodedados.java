import java.util.Scanner;
 import java.util.Random;
 
 public class tirodedados
 { 

 Scanner entrada = new Scanner(System.in);
 Random aleatorio = new Random();
 private int taman;
 int Arreglo[];
 
 
 public void Recibir()
 {  
 System.out.print("\nPor favor introduzca el numero de veces que se lanzaran ");
 System.out.print(" los dados\n");
 taman = entrada.nextInt();
 Arreglo = new int[taman];
 Lanzar();
 }  


 
 // Metodo Lanzar
 

 public void Lanzar()
 {  
 int num1;
 int num2;
 
 for ( int i = 0; i < Arreglo.length; i++ )
 {      // Abre for
 num1 = 1 + aleatorio.nextInt(6); 
 num2 = 1 + aleatorio.nextInt(6);
 
 Arreglo[i] = num1 + num2; 
 }     

 Contar();
 }  
 
 // Metodo Contar


 public void Contar()
 {     
 int Contador[] = new int[13];
 
 for ( int j = 0; j < Arreglo.length; j++ )
 {  
 for ( int k = 0; k < Contador.length; k++ )
 {     
 if ( Arreglo[j] == k )
 Contador[k]++;
 }  
 }  

 mostrar(Contador); 

 }     

 
 // Metodo Imprimir 
 

 public void mostrar( int B[])
 {
 for (int i = 0; i < B.length; i++ )
 {     
 System.out.printf("\n%d lanzamientos sumaron %d\n", B[i], i ); 
 }      
 }  

 } 