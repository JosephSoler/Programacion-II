import java.time.LocalDate;

public class empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private Fecha fechaNacimiento;

    public empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.fechaNacimiento = fechaNacimiento;
    }

    public double obtenerMontoPago() {
        // Lógica para calcular el salario
        double salario = 10000;

        // Verificar si es el mes de cumpleaños y agregar la bonificación
        if (esMesDeCumpleaños()) {
            salario += 100.00;
        }

        return salario;
    }

    private boolean esMesDeCumpleaños() {
        // Obtener el mes actual usando la clase LocalDate
        int mesActual = LocalDate.now().getMonthValue();

        // Comparar con el mes de cumpleaños del empleado
        return mesActual == fechaNacimiento.obtenerMes();
    }

    public String getPrimerNombre() {
        return primerNombre;
    }
}
