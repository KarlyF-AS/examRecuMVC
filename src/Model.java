import java.util.ArrayList;

public class Model {
    /**
     * Lista de calculadoras
     */
    private static ArrayList<Calculadora> calculadora = new ArrayList<>();

    /**
     * agrega una calculadora a la lista de calculadoras
     * @param calc
     */
    public static void addCalculadora(Calculadora calc) {
        calculadora.add(calc);
    }

    /**
     * Suma de ambos numero y retorna el resltado
     * @param v
     * @param sumar
     * @return suma
     */
    public static double sumarNumeros(double v, double sumar) {
        for (Calculadora calc : calculadora) {
            calc.setSumar(calc.getSumar() + sumar);
            break;
        }
        return sumar;
    }

    /**
     * resta de ambos numeros y retorna el resultado
     * @param v
     * @param restar
     * @return
     */
    public static double restarNumeros(double v, double restar) {
        for (Calculadora calc : calculadora) {
            calc.setRestar(calc.getRestar() - restar);
        }
        return restar;
    }
    /**
     * multiplica los numeros "*"
     * @param v
     * @param multiplicar
     */
    public static double multiplicarNumeros(double v, double multiplicar) {
        for (Calculadora calc : calculadora) {
            calc.setMultiplicar(calc.getRestar() * multiplicar);
        }
        return multiplicar;
    }

    /**
     * Divide los numeros
     * @param v
     * @param dividir
     */
    public static double dividirNumeros(double v, double dividir){
        for (Calculadora calc : calculadora) {
            if (dividir != 0) {
                calc.setDividir(calc.getDividir() / dividir);
            } else {
                System.out.println("Error: División por cero no permitida.");
            }
        }
        return dividir;
    }


}


