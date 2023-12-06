
public class pi{
    public static void main(String[]args){
        int num=200;
        double serie=0;
        int incremento=1;
        double p;
        double numerador;


        // el incremento del for va sumando 2 para obtener el denominador impar
        for(int i=1;i<=num; i=i+2){
            p=Math.pow((-1),incremento);
            //variable p obtenemos la variacion del signo
            //System.out.println(p);
            numerador=p*(-4);
            serie +=numerador/i;
            //System.out.println(numerador+"/"+i);
            incremento++;
        }
        System.out.println("el valor de pi es: "+ serie);


    }
}