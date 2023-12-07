public class Prueba {
    public static void main(String[] args) {

        Motocicleta moto1 = new Motocicleta("Honda", "CBR500R", 2022, 500);
        Motocicleta moto2 = new Motocicleta("Yamaha", "YZF-R6", 2021, 600);

        Turismo auto2 = new Turismo("Ford", "Focus", 2020, 4);
        Turismo auto3 = new Turismo("Chevrolet", "Cruze", 2022, 4);

        Conductor motorista1 = new Conductor("Marlon Gutierrez", 25, 5);
        Conductor motorista2 = new Conductor("Cristian Caballero", 20, 3);

        motorista1.setVehiculoAsignado(moto1);
        motorista2.setVehiculoAsignado(moto2);

        System.out.println("Información de los Conductores:");
        System.out.println(motorista1.obtenerInformacion());
        System.out.println("Vehículo Asignado: " + motorista1.obtenerInformacionVehiculoAsignado());

        System.out.println("\n" + motorista2.obtenerInformacion());
        System.out.println("Vehículo Asignado: " + motorista2.obtenerInformacionVehiculoAsignado());

        System.out.println("\nMarcas de las Motocicletas:");
        System.out.println(moto1.getMarca());
        System.out.println(moto2.getMarca());

        System.out.println("\nMarcas de los Turismos:");
        System.out.println(auto2.getMarca());
        System.out.println(auto3.getMarca());

        System.out.println("\nCantidad de Ruedas de las Motocicletas:");
        System.out.println(moto1.getCantidadRuedas());
        System.out.println(moto2.getCantidadRuedas());

        System.out.println("\nCantidad de Ruedas de los Turismos:");
        System.out.println(auto2.getCantidadRuedas());
        System.out.println(auto3.getCantidadRuedas());

        System.out.println("\nLista de Motocicletas:");
        imprimirListaVehiculos(motorista1.getVehiculoAsignado(), motorista2.getVehiculoAsignado());

        System.out.println("\nLista de Turismos:");
        imprimirListaVehiculos(auto2, auto3);
    }

    private static void imprimirListaVehiculos(Vehiculo... vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.obtenerInformacion());
        }
    }
}
