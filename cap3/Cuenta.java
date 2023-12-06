public class Cuenta {
    private String nombre; // variable de instancia
    private double saldo; // variable de instancia

    // Constructor de Cuenta que recibe dos parámetros
    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre; 
        if (saldo > 0.0) 
            this.saldo = saldo;
    }

    // método que deposita (suma) sólo una cantidad válida al saldo
    public void depositar(double montoDeposito) {
        if (montoDeposito > 0.0) // si el montoDeposito es válido
            saldo = saldo + montoDeposito; // lo suma al saldo
    }

    // método que devuelve el saldo de la cuenta
    public double obtenerSaldo() {
        return saldo;
    }

    // método que establece el nombre
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    // método que devuelve el nombre
    public String obtenerNombre() {
        return nombre; // devuelve el valor de name a quien lo invocó
    }// fin del método obtenerNombre




    // Parte del ejercicio 3.11
    // Método retirar

    private double total;

    public void retirar(double retiro) {

        if (retiro < saldo) {
          
         total = saldo - retiro; 
        

        } else {

        total = saldo;
        

        }

    }

    public double obtenretiro(){

     return total;

    }

    // fin de la clase Cuenta

}