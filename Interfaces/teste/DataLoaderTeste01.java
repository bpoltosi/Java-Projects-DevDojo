package Interfaces.teste;

import Interfaces.dominio.DataBaseLoader;
import Interfaces.dominio.DataLoader;
import Interfaces.dominio.FileLoader;

import java.io.File;

public class DataLoaderTeste01 {
    static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        System.out.println("--------------");

        dataBaseLoader.remove();
        fileLoader.remove();

        System.out.println("--------------");

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        System.out.println("--------------");

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
