import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ccwc {
    public static void main(String[] args) {
        File txt = new File(args[args.length - 1]);
        
        switch(args[0]) {
            case "-c": 
                System.out.println(String.format("%d %s", txt.length(), txt.getName()));
                break;
            case "-l":
                int lineCount = 0;

                try {
                    Scanner reader = new Scanner(txt);
                    while (reader.hasNextLine()) {
                        reader.nextLine();
                        lineCount += 1;
                    }
                    reader.close();
                } 
                catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                System.out.println(String.format("%d %s", lineCount, txt.getName()));
                break;
            case "-w":
                int wordCount = 0;

                try {
                    Scanner reader = new Scanner(txt);
                    while (reader.hasNext()) {
                        reader.next();
                        wordCount += 1;
                    }
                    reader.close();
                } 
                catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                System.out.println(String.format("%d %s", wordCount, txt.getName()));
                break;
            case "-m":
                int characterCount = 0;

                try {
                    Scanner reader = new Scanner(txt);
                    while (reader.hasNextLine()) {
                        
                        characterCount += reader.nextLine().length();
                    }
                    reader.close();
                } 
                catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                System.out.println(String.format("%d %s", characterCount, txt.getName()));
                break;
        }
       
    }
}