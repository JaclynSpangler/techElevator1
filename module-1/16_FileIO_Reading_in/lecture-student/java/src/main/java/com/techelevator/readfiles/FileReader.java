package com.techelevator.readfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {
        //Two ways to represent a file:
        File myFile = new File("input.txt"); //Older style, can convert to Path with .toPath()
        Path myPath = Path.of("input.txt");    //Newer style, can convert to File with .toFile()

        try (Scanner fileScanner = new Scanner(myPath)){//puts the close in the try block automatically
            while(fileScanner.hasNextLine()) {
                String s = fileScanner.nextLine();
                System.out.println(s);
            }
            //fileScanner.close();
        }catch (IOException e){
            System.out.println("Cant read from that file!");
        }
//
//        try {
//            List<String> allLines = Files.readAllLines(myPath);
//        } catch (IOException e) {
//            System.out.println("Cant read from that file!");
//        }
    }

}
