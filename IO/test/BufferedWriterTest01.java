package IO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("bruno saldanha poltosi");
            bw.newLine();
            bw.flush();
        }
         catch(IOException e) {
            throw new RuntimeException(e);
    }
}}