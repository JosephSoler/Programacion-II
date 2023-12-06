
public class ternaspitagoricas

{       


public static void main(String[]args)
{  
int Tamano = 500;
System.out.print("\nEste programa prueba e imprime todas las ternas");
System.out.printf(" pitagoricas para numeros no mayores que %d ", Tamano);
System.out.print(" mediante la fuerza bruta.\n");

for ( int i = 1; i <= Tamano; i++ )
for ( int j = 1; j <= Tamano; j++ )
for ( int k = 1; k <= Tamano; k++ )
{  

if ( Math.pow(i,2) == Math.pow(j,2) + Math.pow(k,2) )
System.out.printf("%3d\t%3d\t%3d\n", i, j, k);
}     

} 
}  