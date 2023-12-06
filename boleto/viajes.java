import java.util.Scanner;

public class viajes {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Desea comprar un boleto de avión? (sí/no): ");
        String respuesta = scanner.nextLine();
        
        if (respuesta.equalsIgnoreCase("no")) {
            System.out.println("¡Que tenga un buen día!");
        } else if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Elija su destino: ");
            System.out.println("1.- Comayagua(Honduras)----------Madrid(España)");
            System.out.println("2.- Comayagua(Honduras)----------New York(Estados Unidos)");
            System.out.println("3.- Comayagua(Honduras)----------Berlín(Alemania)");
            
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Usted ha elegido Comayagua(Honduras)----------Madrid(España)");
                    break;
                case 2:
                    System.out.println("Usted ha elegido Comayagua(Honduras)----------New York(Estados Unidos)");
                    break;
                case 3:
                    System.out.println("Usted ha elegido Comayagua(Honduras)----------Berlín(Alemania)");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }
            
            System.out.println("Seleccione su horario de vuelo: ");
            System.out.println("1.- 05:00 A.M. Día 10 de Diciembre");
            System.out.println("2.- 04:00 P.M. Día 8 de Diciembre");
            
            int horario = scanner.nextInt();
            switch (horario) {
                case 1:
                    System.out.println("Su vuelo está programado para las 05:00 A.M. del día 10 de Diciembre.");
                    break;
                case 2:
                    System.out.println("Su vuelo está programado para las 04:00 P.M. del día 8 de Diciembre.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } else {
            System.out.println("Respuesta no válida. Por favor, introduzca 'sí' o 'no'.");
        }
        
        scanner.close();
    }
}
