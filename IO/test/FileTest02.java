package IO.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta de senhas");
        boolean isDiretorioCriated = fileDiretorio.mkdir();
        System.out.println("Diretorio foi criado: " +isDiretorioCriated);

        File fileArquivoDiretorio = new File(fileDiretorio,"brunopoltosi.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo foi criado: " +isFileCreated);

        File fileRenamed = new File(fileDiretorio,"senhas_Bruno_Poltosi.txt");
        boolean isFileRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo foi renomeado: " + isFileRenamed);

        File diretorioRenamed = new File("senhas_novas");
        boolean isDirectoryRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio foi renomeado: " + isDirectoryRenamed);
    }
}
