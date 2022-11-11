import java.util.ArrayList;
import java.util.Random;

public class Dice {

    private int countOfDice;

    public void setCountOfDice(int countOfDice) {
        this.countOfDice = countOfDice;
    }

    public int getCountOfDice() {
        return countOfDice;
    }

    public Dice( int countOfDice){
        this.countOfDice = countOfDice;
    }

    public Integer tossAndSum(){
        int sum =0;
        Random r = new Random();

        for(int i=0; i<countOfDice; i++){

            sum+=r.nextInt(6)+1;

        }
        return sum;
    }
}
