import java.util.ArrayList;

// Clase base Figura
class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerDescripcion() {
        return "Figura: " + nombre;
    }
}

// Clase FiguraBidimensional que hereda de Figura
class FiguraBidimensional extends Figura {
    public FiguraBidimensional(String nombre) {
        super(nombre);
    }

    public double obtenerArea() {
        return 0;  // Este método se implementará en las clases derivadas
    }
}

// Clase FiguraTridimensional que hereda de Figura
class FiguraTridimensional extends Figura {
    public FiguraTridimensional(String nombre) {
        super(nombre);
    }

    public double obtenerArea() {
        return 0;  // Este método se implementará en las clases derivadas
    }

    public double obtenerVolumen() {
        return 0;  // Este método se implementará en las clases derivadas
    }
}

// Clase Circulo que hereda de FiguraBidimensional
class Circulo extends FiguraBidimensional {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

// Clase Cuadrado que hereda de FiguraBidimensional
class Cuadrado extends FiguraBidimensional {
    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return Math.pow(lado, 2);
    }
}

// Clase Esfera que hereda de FiguraTridimensional
class Esfera extends FiguraTridimensional {
    private double radio;

    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}

// Clase Cubo que hereda de FiguraTridimensional
class Cubo extends FiguraTridimensional {
    private double lado;

    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double obtenerVolumen() {
        return Math.pow(lado, 3);
    }
}

// Programa principal
public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5));
        figuras.add(new Cuadrado(4));
        figuras.add(new Esfera(3));
        figuras.add(new Cubo(2));

        for (Figura figura : figuras) {
            System.out.println(figura.obtenerDescripcion());
            if (figura instanceof FiguraBidimensional) {
                System.out.println("Área: " + ((FiguraBidimensional) figura).obtenerArea());
            } else if (figura instanceof FiguraTridimensional) {
                System.out.println("Área: " + ((FiguraTridimensional) figura).obtenerArea());
                System.out.println("Volumen: " + ((FiguraTridimensional) figura).obtenerVolumen());
            }
            System.out.println();
        }
    }
}
