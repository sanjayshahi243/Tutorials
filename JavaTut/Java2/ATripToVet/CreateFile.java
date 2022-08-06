import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.io.FileWriter;

import java.util.Scanner; // Import the Scanner class to read text files

public class CreateFile {
    CreateFile () {

    }
    
    public static void writeFile (File filename) {
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write("This is java program written file. This is next Line.");
            fw.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void readFile (File filename) {
        try {
            Scanner reader = new Scanner(filename);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteFile (File filename) {
        if (filename.delete()) { 
            System.out.println("Deleted the file: " + filename.getName());
          } else {
            System.out.println("Failed to delete the file.");
          } 
    }

    public static void main(String[] args) {
        try {
            File myObj = new File ("test.txt");
            if (myObj.createNewFile()) {
                System.out.println("File Created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            writeFile(myObj);
            readFile(myObj);
            deleteFile(myObj);
        } catch (IOException e) {
            System.out.println("No File Created.");
            e.printStackTrace();
        }
    }
}
