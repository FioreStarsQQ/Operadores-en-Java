
// Programa Java para ilustrar
// Operadores de comparación
public class OperadoresComparacion {
    public static void main(String[] args) {
        int a = 20, b = 10;
        String x = "Python", y = "Java";
        int ar[] = { 1, 2, 3 };
        int br[] = { 1, 2, 3 };
        boolean condicion = true;

        // varios operadores condicionales
        System.out.println("a == b :" + (a == b));
        System.out.println("a < b :" + (a < b));
        System.out.println("a <= b :" + (a <= b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a >= b :" + (a >= b));
        System.out.println("a != b :" + (a != b));

        // Las variables string se estan comparando con el método equals()
        if (x.equals(y)){
        System.out.println("x == y");    
        } else{
            System.out.println("x != y");
        }
        // Los Arrays no se pueden comparar con
        // operadores relacionales porque los objetos
        // almacenan referencias, mas no el valor    
        System.out.println("ar == br : " + (ar == br));

        System.out.println("condicion==true :" + (condicion == true));
    }
}


