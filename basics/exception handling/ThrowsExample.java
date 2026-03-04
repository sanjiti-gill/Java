import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    
    // CORRECT: throws keyword is in method signature, NOT inside method body
    public static void readFile(String filename) 
            throws FileNotFoundException, IOException {  
        
        // This line can throw FileNotFoundException (which is a type of IOException)
        FileReader file = new FileReader(filename);
        
        // In real code, you'd do something with the file here
        System.out.println("File opened successfully: " + filename);
        
        // Don't forget to close! (would be in finally block normally)
        // file.close();
    }

    public static void main(String[] args) {
        try {
            readFile("Missing.txt");  // This will throw FileNotFoundException
            
        } catch (FileNotFoundException e) {  // Child class FIRST
            System.out.println("file not found: " + e.getMessage());
            
        } catch (IOException e) {  // Parent class AFTER child
            System.out.println("io error: " + e.getMessage());
        }
        
        System.out.println("Program continues after try-catch");
    }
}
