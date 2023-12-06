import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private String nombre;
    private String fecha;

    public Cliente(String nombre, String producto, double precio, int cantidad, double total) {
        this.nombre = nombre;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.fecha = sdf.format(new Date());

        System.out.printf("%nCliente: " + this.nombre);
        System.out.printf("%nFecha: " + this.fecha);
        System.out.printf("%nCantidad: " + cantidad);
        System.out.printf("%nProducto: " + producto);
        System.out.printf("%nPrecio unitario: " + precio);
        System.out.printf("%nTotal: " + total);
    }
}

