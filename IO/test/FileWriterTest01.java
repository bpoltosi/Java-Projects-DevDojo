package IO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write("bruno saldanha poltosi");
            fileWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
