import java.util.Scanner;

public class buscarmenor{
 public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
       
        System.out.print("Por favor ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        int arreglo [] = new int [n];
       
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese dato "+(i+1)+": ");
            arreglo [i] = entrada.nextInt();
        }
       
        int menor;
        menor = arreglo [0];
       
        for (int i = 0; i < arreglo.length; i++) {
           
            if(arreglo[i]<menor) {
                menor = arreglo[i];
            }
        }
        
        System.out.println("El menor valor es: "+menor);

    
        entrada.close();

 }



    
}