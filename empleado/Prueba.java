public class Prueba {
    public static void main(String[] args) {
        // Crear objetos Fecha para representar las fechas de nacimiento
        Fecha fechaCumpleaños1 = new Fecha(10, 5, 1990);
        Fecha fechaCumpleaños2 = new Fecha(15, 8, 1985);

        // Crear objetos Empleado con las fechas de nacimiento
        empleado empleado1 = new empleado("Juan", "Pérez", "123-45-6789", fechaCumpleaños1);
        empleado empleado2 = new empleado("María", "Gómez", "987-65-4321", fechaCumpleaños2);

        // Crear un arreglo de empleados
        empleado[] empleados = { empleado1, empleado2 };

        // Procesar la nómina y mostrar resultados
        Nomina.procesarNomina(empleados);
    }
}
