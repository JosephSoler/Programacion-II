import java.util.Scanner;

  public class ventas
  {   
    public static void main(String []args){    

   double total = 0;
   int producto;
   int cantidad;



  Scanner entrada = new Scanner(System.in); 

 
  System.out.println("\nPrecios y productos:");
  System.out.println("\n1: $2.98");
  System.out.println("\n2: $4.50");
  System.out.println("\n3: $9.98");
  System.out.println("\n4: $4.49");
  System.out.println("\n5: $6.87\n");

  System.out.println("\n Ingrese el numero del producto:");
  System.out.println("( 6 para terminar).");
  producto = entrada.nextInt(); 

  while ( 6 != producto )
  {      
   
  switch ( producto )
  {   

  case 1:
  {    

    System.out.print("\nIntroduzca la cantidad vendida de este producto:");
    cantidad = entrada.nextInt();
    System.out.printf("\nTotal: %f", cantidad*2.98);
    //suma una cantidad valor total
    total += cantidad*2.98;
    break;
  }  

  case 2:
  {   

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad= entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad*4.50);
  total += cantidad*4.50;
  break;
  }  

  case 3:
  {    

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad*9.98);
  total += cantidad*9.98;
  break;
  }  
   
  case 4:
  {    

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad*4.49);
  total += cantidad*4.49;
  break;
  } 

  case 5:
  {    

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad*6.87);
  total += cantidad*6.87;
  break;
  }  


  default :
  {    

  System.out.print("\nINTRODUZCA NUMERO DE PRODUCTO VALIDO!");
  break;
  }  

  }   
  System.out.println("\n Ingrese el numero del siguiente producto:");
  System.out.println("( 6 para terminar).");
  producto = entrada.nextInt(); 


  }        

  System.out.printf("\nLas ventas totales fueron: %f\n\n",total);

  entrada.close();
  }       
}   
      