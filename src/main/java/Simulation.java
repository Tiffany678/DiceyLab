
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
        System.out.println("\t"+(i+b.getNum())+" : \t"+b.getBin(i+b.getNum())+" : \t"+String.format("%.2f",(double)b.getBin(i+b.getNum())/numOfToss));
    }
    }
    public static void main (String[] arg) {

        Simulation sim = new Simulation(2, 10000);
        sim.runSimulation();
        sim.printResults();

    }
}
