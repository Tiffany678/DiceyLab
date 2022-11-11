import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Bins {

   // private Map<Integer, Integer> toss;
    private int numOfToss;
    private int[] arr;
    private int num;

    public Bins(int num1, int num2){
        num=num1;
        arr = new int[num2-num1+1];
        for(int i=0; i<num2-num1; i++){
            arr[i]=0;
        }
    }
    public Integer getBin(int numbin){
        return arr[numbin-num];
    }
    public void incrementBin(int numbin){
        arr[numbin-num]++;
    }

    public int getNum() {
        return num;
    }
    public int getSize(){
        return arr.length;
    }
}
