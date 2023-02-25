package ExceptionHandling.CheckedException;// Java Program to Illustrate Handling of Checked Exception

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
class Basic {

    // Main driver method
    public static void main(String[] args)
            throws FileNotFoundException
    {

        // Assigning null value to object of FileInputStream
        FileInputStream fileInputStream = null;

        // Try block to check for exceptions
        try {

            // Giving path where file should exist to read
            // content
            FileReader file = new FileReader("C:\\Program Files\\Notepad++\\UDM Commands.txt");

            // Reading content inside a file
            BufferedReader fileInput = new BufferedReader(file);

            // Printing first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 5; counter++)
                System.out.println(fileInput.readLine());

            // Closing all file connections
            // using close() method
            // Good practice to avoid any memory leakage
            fileInput.close();
        }

        // Catch block to handle exceptions
        catch (FileNotFoundException e) {

            // Display message when exception occurs
            System.out.println(e.getMessage());
            System.out.println("File does not exist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
