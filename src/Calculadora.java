/**
 * Clase calculadora que contendá los metodos
 */
public class Calculadora {
    //atributos
    private double sumar;
    private double restar;
    private double multiplicar;
    private double dividir;

    //constructor
    public Calculadora (double sumar, double restar, double multiplicar, double dividir){
        this.sumar = sumar;
        this.restar = restar;
        this.multiplicar = multiplicar;
        this.dividir = dividir;
    }
//getters y setters
    public double getSumar() {
        return sumar;
    }

    public void setSumar(double sumar) {
        this.sumar = sumar;
    }

    public double getRestar() {
        return restar;
    }

    public void setRestar(double restar) {
        this.restar = restar;
    }

    public double getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(double multiplicar) {
        this.multiplicar = multiplicar;
    }

    public double getDividir() {
        return dividir;
    }

    public void setDividir(double dividir) {
        this.dividir = dividir;
    }

    /**
     * Suma dos numeros (a + b)
     * @param a
     * @param b
     * @return resultado de la suma
     */
    //metodos
    public double suma(double a, double b) {
        return a + b;
    }

    /**
     * Resta dos numeros (a - b)
     * @param a
     * @param b
     * @returnresultado de la resta
     */
    public double resta(double a, double b) {
        return a - b;
    }
    /**
     * Multiplica dos numeros (a * b)
     * @param a
     * @param b
     * @return resultado de la multiplicacion
     */
    public double multiplicacion(double a, double b) {
        return a * b;
    }
    /**
     * Divide dos numeros (a / b)
     * @param a
     * @param b
     * @return resultado de la division
     */
    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero");
        }
        return a / b;
    }
}
