package exception.runtime;

public class RuntimeExceptionTest02 {
    static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Codigo finalizado");
    }

    private static int divisao(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal: divisor nao pode ser igual a 0");
        }
        return a / b;
    }
}
