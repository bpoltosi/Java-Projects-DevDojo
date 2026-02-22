package exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    static void main(String[] args) {
    criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado" + isCriado);
            file.createNewFile();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
