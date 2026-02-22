package NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/senhas/senhas_bruno");
        Path subPastaDirectories = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(), "senha.txt");
        Files.createFile(filePath);
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "senha.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}