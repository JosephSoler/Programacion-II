
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class facturacliente {
        private String nombreCliente;
        private boolean imprimirFecha;

        public facturacliente(String nombreCliente, boolean imprimirFecha) {
            this.nombreCliente = nombreCliente;
            this.imprimirFecha = imprimirFecha;
        }

        // opcion de pregumtar si quiere fecha
        public void imprimirFactura(LineaFactura linea) {
            System.out.println("\nFactura para: " + nombreCliente);
            linea.imprimirDetalleFactura();

            if (imprimirFecha) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date fechaActual = new Date();
                System.out.println("Fecha: " + sdf.format(fechaActual));
            }
        }
    }

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre del cliente: ");
            String nombreCliente = scanner.nextLine();

            System.out.print("¿Desea imprimir la fecha en la factura? (true/false): ");
            boolean imprimirFecha = scanner.nextBoolean();


            LineaFactura linea = new LineaFactura("Producto", 1, 10.0);


            facturacliente facturaCliente = new facturacliente(nombreCliente, imprimirFecha);


            facturaCliente.imprimirFactura(linea);
    }
}


