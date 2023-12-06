import java.util.Scanner;

public class LineaFactura{
    private String producto;
    private int cantidad;
    private double precioUnitario;


    public LineaFactura(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }


    public double getSubtotal() {
        return cantidad * precioUnitario;
    }


    public String getProducto() {
        return producto;
    }


    public int getCantidad() {
        return cantidad;
    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        LineaFactura linea = new LineaFactura(producto, cantidad, precioUnitario);
        double subtotal = linea.getSubtotal();

        System.out.println("\nDetalle de la Factura:");
        System.out.println("Producto: " + linea.getProducto());
        System.out.println("Cantidad: " + linea.getCantidad());
        System.out.println("Precio Unitario: $" + linea.getPrecioUnitario());
        System.out.println("Subtotal: $" + subtotal);
        scanner.close();
    }
}