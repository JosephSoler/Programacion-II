// Clase principal Vehículo
class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String obtenerInformacion() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año;
    }

    // Método para obtener la cantidad de ruedas
    public int getCantidadRuedas() {
        return 0; // La implementación específica se hará en las clases hijas
    }
}

// Clase Motocicleta que hereda de Vehículo
class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int año, int cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + ", Cilindrada: " + cilindrada + " cc";
    }

    @Override
    public int getCantidadRuedas() {
        return 2;
    }
}

// Clase Turismo que hereda de Vehículo
class Turismo extends Vehiculo {
    private int numeroPuertas;

    public Turismo(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + ", Número de puertas: " + numeroPuertas;
    }

    @Override
    public int getCantidadRuedas() {
        return 4;
    }
}
