
// Programa Java para ilustrar
// operadores shift
public class OperadoresShift {
    public static void main(String[] args) {

        int a = 0x0005;
        int b = -10;

        // operador de desplazamiento a la izquierda
        // 0000 0101<<2 =0001 0100(20)
        // similar a 5*(2^2)
        System.out.println("a<<2 = " + (a << 2));

        // operador de desplazamiento a la derecha
        // 0000 0101 >> 2 =0000 0001(1)
        // similar a 5/(2^2)
        System.out.println("a>>2 = " + (a >> 2));

        // operador de cambio a la derecha sin firmar
        System.out.println("b>>>2 = " + (b >>> 2));

    }
}