package mypackage; 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Count {
    private BufferedReader reader;

    public Count(BufferedReader reader) {
        this.reader = reader;
    }

    public int bytes() {
        int byteCount = 0;
        
        return byteCount;
    }

    // public int lines() {
    //     int lineCount = 0;
    
    //     try {
    //         Scanner reader = new Scanner(file);
    //         while (reader.hasNextLine()) {
    //             reader.nextLine();
    //             lineCount += 1;
    //         }
    //         reader.close();
    //     } 
    //     catch (FileNotFoundException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }
    //     return lineCount;
    // }
               
    // public int words() {
    //     int wordCount = 0;
    
    //     try {
    //         Scanner reader = new Scanner(file);
    //         while (reader.hasNext()) {
    //             reader.next();
    //             wordCount += 1;
    //         }
    //         reader.close();
    //     } 
    //     catch (FileNotFoundException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }
    //     return wordCount;         
    // }
}
