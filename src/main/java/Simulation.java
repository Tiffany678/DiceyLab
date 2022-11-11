public class Simulation {
public void main (String[] arg) {
//    Simulation sim = new Simulation(2, 10000);
//
//    sim.runSimulation();
//
//    sim.printResults();

    Dice d = new Dice(2);

//     int result1 = d.setDiceNum()
//    int result2 = d.setDiceNum()
//     int ExpectedSum = result1 + result2;
//    int autual = d.getSum(result1+result2);
    System.out.println(d.rollDice(2));

}
}
