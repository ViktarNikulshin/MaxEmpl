
package maxemployees;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ReadTxt {
//    private ArrayList<Double> startTime;
//    private ArrayList<Double> endTime;
    
   public void readFile (String nameFile) throws FileNotFoundException, IOException{
           FileInputStream fstream = new FileInputStream(nameFile);
           BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
           String strLine;
           String dLine;
           Double dbLine;
           Double deLine;
           ArrayList<Double> startTime = new ArrayList<>();
           ArrayList<Double> endTime  = new ArrayList<>();
       try {
           while ((strLine = br.readLine()) != null){
              dLine = strLine.replace(':', '.');
              dbLine = Double.parseDouble(dLine.substring(0, 5));
              deLine = Double.parseDouble(dLine.substring(6, 11));
              startTime.add(dbLine);
              endTime.add(deLine);
               System.out.println(dbLine +" from "+deLine);
           }
           FindMax findMax = new FindMax();
           Integer max = findMax.scanTime(startTime, endTime);
           System.out.println("Max Employees :" + max);
       } catch (IOException ex) {
           System.out.println("Ошибка");
       }
       br.close();
   }
    
}
