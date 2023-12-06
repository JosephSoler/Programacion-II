public class Nomina {
    public static void procesarNomina(empleado[] empleados) {
        for (empleado empleado : empleados) {
            double montoPago = empleado.obtenerMontoPago();
            System.out.printf("Monto de pago para %s: $%,.2f%n", empleado.getPrimerNombre(), montoPago);
        }
    }
}
