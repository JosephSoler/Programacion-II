
public class crecimiento{
    public static void main(String[] args){
        double tasa=0.31;
        double PobActual=7.9;
        double total;
        double aumento;
        double[] arreglo = new double[76];
        double[] arreglo2 = new double[76];
    
        total=0;
       
       
        
       for(int contador=0; contador<arreglo.length; contador++){
            total=(PobActual*tasa)+PobActual;
            arreglo[contador]=total;
                  
            for(int c=0; c<arreglo.length; c++){
                aumento=total-PobActual;
                arreglo2[c]=aumento;
            }
            PobActual=total;
        }
        
        System.out.printf("%s%27s%25s%n", "Anio","Poblacion(billones)","Aumento");
        for(int Contador=0;Contador<76; Contador++ ){
            System.out.printf("%2d%28f%28f%n", Contador, arreglo[Contador],arreglo2[Contador]);
        }

        







    }



}