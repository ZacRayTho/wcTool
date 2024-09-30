package mypackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccwc {
    public static void main(String[] args) {
        BufferedReader reader = null;
        if (!args[args.length - 1].contains(".txt")) {
            System.out.println("No txt found");
            reader = new BufferedReader(new InputStreamReader(System.in));
        } else {
            System.out.println("Txt found");
            try {
                File txt = new File(args[args.length - 1]);
                FileReader fileRead = new FileReader(txt);
                reader = new BufferedReader(fileRead);
            } catch (Exception e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        Count counter = new Count(reader);
        switch (args[0]) {
            case "-c":
                System.out.println(String.format("%d %s", counter.bytes(), args[args.length - 1]));
                break;
            // case "-l":
            // System.out.println(String.format("%d %s", counter.lines(), args[args.length -
            // 1]));
            // break;
            // case "-w":
            // System.out.println(String.format("%d %s", counter.words(), args[args.length -
            // 1]));
            // break;
            case "-m":
                int byteCount = 0;
                try {
                    while (reader.read() != -1) {
                        byteCount++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(String.format("%d %s", byteCount, args[args.length - 1]));
                break;
            default:
                // System.out.println(String.format("%d %d %d %s", counter.lines(),
                // counter.words(), counter.bytes(), args[args.length - 1]));
                // break;
        }

    }
}