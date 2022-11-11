
public class Simulation {
    private Bins b;
    private int numOfToss;

    public Simulation(int numberOfDice, int numberOfTosses){
        b=new Bins(numberOfDice,numberOfDice*6);
        numOfToss=numberOfTosses;
    }
    public void runSimulation(){
        Dice d =new Dice(b.getNum());
        for(int i=0; i<numOfToss; i++){
            b.incrementBin(d.tossAndSum());
        }
    }
    public void printResults(){

    System.out.println("***");
    System.out.println("Simulation of " +b.getNum()+ " dice tossed for "+numOfToss+ " times.");
    System.out.println("***");
    for(int i=0; i<b.getSize(); i++){
        System.out.println(String.format("%2d:%8d:  %.2f",i+b.getNum(),b.getBin(i+b.getNum()),(double)b.getBin(i+b.getNum())/numOfToss));
    }
    }
    public static void main (String[] arg) {

        Simulation sim = new Simulation(2, 10000);
        sim.runSimulation();
        sim.printResults();
//        double d=3.324523;
//        int e=23423424;
//        System.out.println(String.format("%.3f:%2d",d,e));
    }
}
