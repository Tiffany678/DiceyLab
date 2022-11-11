import java.util.ArrayList;
import java.util.Random;

public class Dice {

   // ArrayList<Integer> numsOfDice = new ArrayList<>();

    /*==>get the sum of the dices[dice1, dice2]: diceSum = dice1 +dice2
     *==>get the total N times of the dicesSum:tossAndSum
     *count the specific dicesSum accurency of the sum
     */
    int diceNum=0;
    ArrayList<Integer> numsOfDice;
    int tossAndSum=0;

    public Dice(){
        ArrayList<Integer> numsOfDice = new ArrayList<>(diceNum);
    }
    public int[] rollDice(int diceNum) {

      for(int i=0; i<diceNum; i++) {
          diceNum=(int)Math.random()*6+1;
          this.diceNum = diceNum;
      }
    }

    public void setNumsOfDice(int numsOfDice) {
        this.numsOfDice = numsOfDice;
    }

    public int getNumberOfDices(){
        return numsOfDice;
    }
    //get the dice number
//    public int getDiceNumber(){
//
//        return this.diceNum;
//    }
    //This method will return the sum of all the dices in the bin
    public int getSum(){
        int sum =0;
        for(int i=0; i<this.numsOfDice; i++){
            sum+=this.diceNum;
        }
        return sum;
    }
}
