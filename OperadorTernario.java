
// Programa Java para ilustrar
// el máximo de tres números utilizando
// Operador ternario.
public class OperadorTernario {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 30, result;

        // el resultado obtiene el máximo de tres
        // numeros
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Máximo de tres números = " + result);
    }
}