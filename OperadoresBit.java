
// Programa Java para ilustrar
// operadores bit a bit (bitwise)
public class OperadoresBit {
    public static void main(String[] args) {

        int a = 0x0005;
        int b = 0x0007;

        // bitwise AND
        // 0101 & 0111=0101
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010
        System.out.println("a^b = " + (a ^ b));

        // bitwise complemento
        // ~0101=1010
        System.out.println("~a = " + ~a);

        // también se puede combinar con el
        // operador de asignación
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }
}