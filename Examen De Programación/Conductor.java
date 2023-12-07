class Conductor {
    private String nombre;
    private int edad;
    private int añosExperiencia;
    private Vehiculo vehiculoAsignado;


    public Conductor(String nombre, int edad, int añosExperiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosExperiencia = añosExperiencia;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }


    public String obtenerInformacion() {
        return "Nombre del Conductor: " + nombre + ", Edad: " + edad + " años, Años de Experiencia: " + añosExperiencia;
    }


    public void setVehiculoAsignado(Vehiculo vehiculo) {
        this.vehiculoAsignado = vehiculo;
    }


    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }


    public String obtenerInformacionVehiculoAsignado() {
        if (vehiculoAsignado != null) {
            return "Vehículo Asignado: " + vehiculoAsignado.obtenerInformacion();
        } else {
            return "No hay vehículo asignado.";
        }
    }
}
