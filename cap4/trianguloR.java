import java.util.Scanner;
public class trianguloR {

public static void main(String [] args)
{
Scanner entrada=new Scanner(System.in);
int lado1, lado2, lado3, h=0;
int catetoA=0, catetoO=0;
System.out.println("Ingrese el valor del primer lado: ");
lado1=entrada.nextInt();
System.out.println("Ingrese el valor del segundo lado: ");
lado2=entrada.nextInt();
System.out.println("Ingrese el valor del tercer lado: ");
lado3=entrada.nextInt();
h=0;

if (lado1>lado2 && lado1>lado3){
    h=lado1; 
    catetoA=lado2;
    catetoO=lado3;
    
}
if (lado2>lado1 && lado2>lado3){
    h=lado2;
    catetoA=lado1;
    catetoO=lado3;
   
}
if (lado3>lado1 && lado3>lado2){
    h=lado3;
    catetoA=lado1;
    catetoO=lado2;
    
}

if (Math.pow(h,2)==(Math.pow(catetoA,2)+Math.pow(catetoO,2))){

System.out.println("Si podria ser un triangulo rectangulo");
}
else {

    System.out.println("No puede ser un triangulo rectangulo");
}

entrada.close();
}

}
