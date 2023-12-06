
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Factura factura = new Factura();
        double total = factura.calcularTotal();

        System.out.println("Total: " + total);

        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = scanner.nextLine();
        System.out.printf("**************************");
        System.out.println("");
        System.out.printf("          Menu");
        System.out.println("");
        System.out.printf("**************************");

        Cliente cliente = new Cliente(nombreCliente, factura.getProducto(), factura.getPrecio(), factura.getCantidad(), total);
    }
}

