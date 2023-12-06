import java.util.Scanner;
public class prueba {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Ejecutando la clase Viajes ----");
        viajes.main(args);
        
        System.out.println("\n---- Ejecutando la clase Asientos ----");
        asientos.main(args);
        scanner.close();
    }
}
