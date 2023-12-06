import java.util.Scanner;

public class Factura {
    private String producto;
    private double precio;
    private int cantidad;

    public Factura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto:");
        this.producto = scanner.nextLine();
        System.out.println("Ingrese el precio del producto:");
        this.precio = scanner.nextDouble();
        System.out.println("Ingrese la cantidad:");
        this.cantidad = scanner.nextInt();
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularTotal() {
        return precio * cantidad;
    }
}