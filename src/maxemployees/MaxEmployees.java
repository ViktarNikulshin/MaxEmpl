
package maxemployees;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MaxEmployees {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {
       Scanner newscan= new Scanner(System.in);
        String nameFile;
        System.out.println("Inter file name");
       nameFile = newscan.next();
       ReadTxt rt = new ReadTxt();
       rt.readFile(nameFile);
    }
    
}
