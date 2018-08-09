
package maxemployees;

import java.util.ArrayList;


public class FindMax {
    
    public Integer scanTime (ArrayList<Double> startTime, ArrayList<Double> endTime){
        Integer max=0;
        Integer n=1;
        for(int i = 0; i < startTime.size(); i++) {
            for(int j = 0; j < startTime.size(); j++) {
                if (i!=j && startTime.get(i)<=endTime.get(j) && endTime.get(i)>=startTime.get(j)){
                 n = n+1;
            }
           }
            if(n>max){     
               max=n;
             }
            n=1;
        }
        return max;
    }
}
