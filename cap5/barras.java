import java.util.Scanner;
public class barras {
    public static void main(String[]args){
        int n;
        Scanner entrada=new Scanner(System.in);
        int[] arreglo= new int[5];

        System.out.println("Ingrese 5 numeros (entre 1 al 30): ");
    
        // pedir 
       
    for (int c=0; c<5; c++){
        System.out.println("#"+(c+1)+": ");
        n=entrada.nextInt();
        arreglo [c] = n;   
     }
    

    
 System.out.println();
 n=arreglo[0];
 int num;
 //barras
    if (n>30){
        System.out.println("Las barras no se pueden realizar ya que solo se ingresan numeros del 1 al 30");
    }

    if (n>=1 && n<=30 ){
      
        for (int i=0; i<arreglo.length; i++){
            num=arreglo[i];
            System.out.println(arreglo[i]+": ");
            for (int j=num; j<=num; j++){
                //
                for(int k = 1; k <=num; k++) {
                   
                    System.out.print("*");
                }
                System.out.println();
            }
           
        }
        
    }
    


 // fin
 entrada.close();
    }

}
