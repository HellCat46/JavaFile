import java.io.*;
import java.util.*;

public class Program1 {
    public static void main(String[] args) throws FileNotFoundException {
        printData("Data.txt");
    }

    public static void printData(String filePath) throws FileNotFoundException {
        File file;
        Scanner sc;
        try {
            file = new File(filePath);
            sc = new Scanner(file);
            String firstLine = sc.nextLine();

            if (!Objects.equals(firstLine, "Company Data")) throw new FileNotFoundException("Unknown File. File doesn't contains Company Data.");

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            System.out.println("--- End of File ---");
        }catch (FileNotFoundException ex){
            throw new FileNotFoundException(ex.getMessage());
        }catch (Exception ex){
            System.out.println("Unexpected Error.");
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Attempted to read file.");
        }
    }
}