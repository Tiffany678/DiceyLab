import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Bins {

    private int numOfToss;
    private int[] arr;
    private int num;

    public Bins(int num1, int num2){
        num=num1;
        arr = new int[num2-num1+1];
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
