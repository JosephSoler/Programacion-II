public class damass{
    public static void main(String[]args){

    int d=0;
    do{
        //lineas
        for(int i=0; i<8;i++){
            System.out.print("* ");
           
        }
        System.out.println();


        //espacio y lineas
        for(int j=0; j<8;j++){
            System.out.print(" *");
            
        }
        System.out.println();
        
    d++;    
   }while(d<4);
        
    }
}