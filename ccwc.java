import java.io.File;

public class ccwc {
    public static void main(String[] args) {
        File txt = new File(args[args.length - 1]);
        
        switch(args[0]) {
            case "-c": 
                System.out.println(String.format("%d %s", txt.length(), txt.getName()));
                break;
            case "-l":
                // Read number of lines in a file
                break;
        }
       
    }
}