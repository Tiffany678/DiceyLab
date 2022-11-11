import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Bins {

    // ArrayList<Integer> numsOfDice = new ArrayList<>();

    /*get the sum of the dices[dice1, dice2]: diceSum = dice1 +dice2
     *get the total N times of the dicesSum: tossAndSum
     * ==>create a TreeMap to store the tossAndSum: key= sum; value= currency;
     */

    public Bins (int low, int high){
        Map<Integer,Integer> binResult = new TreeMap<>();
        for(int i=low; i<=high; i++){
            binResult.put(i,0);
        }

    }




//    Bins results = new Bins(2, 12); // for bins from 2..12
//    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
//    results.incrementBin(10); // should increment bin # 10


}
