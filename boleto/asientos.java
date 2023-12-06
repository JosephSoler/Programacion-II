import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class asientos {
    public static void main(String[] args) {
        ArrayList<String> asientosDisponibles = generarAsientos();
       Scanner scanner = new Scanner(System.in);
        boolean asientoElegido = false;

        System.out.println("Asientos disponibles:");
        for (String asiento : asientosDisponibles) {
            System.out.println(asiento);
        }

        while (!asientoElegido) {
            System.out.print("Ingrese el asiento que desea: ");
            String asientoUsuario = scanner.nextLine().toUpperCase();

            if (asientosDisponibles.contains(asientoUsuario)) {
                asientoDisponible(asientoUsuario, asientosDisponibles);
                asientosDisponibles.remove(asientoUsuario);
                asientoElegido = true;
            } else {
                System.out.println("Lo siento, ese asiento ya está ocupado o no es válido. Por favor, elija otro.");
            }
        }

        System.out.println("¡Que tenga un buen día!");
        scanner.close();
    }

    public static ArrayList<String> generarAsientos() {
        ArrayList<String> asientos = new ArrayList<>();
        Random random = new Random();
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        while (asientos.size() < 10) {
            char letra = letras[random.nextInt(letras.length)];
            int numero = random.nextInt(10) + 1;
            String asiento = letra + String.valueOf(numero) + (random.nextBoolean() ? "(Ventana)" : "");

            if (!asientos.contains(asiento)) {
                asientos.add(asiento);
            }
        }
        return asientos;
    }

    public static void asientoDisponible(String asiento, ArrayList<String> asientosDisponibles) {
        System.out.println("El usuario eligió el asiento " + asiento + ". ¡Que tenga un buen día!");
        
        
        for (int i = 0; i < asientosDisponibles.size(); i++) {
            String asientoDisponible = asientosDisponibles.get(i);
            if (asientoDisponible.startsWith(asiento.substring(0, 2))) {
                asientosDisponibles.set(i, asientoDisponible.replace("(Ventana)", "(Ocupado)"));
            
            }
            
        }
    
    }
}
