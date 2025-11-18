public class Main {
    public static void main(String []args){
        FrogSimulation frogsim = new FrogSimulation(24,5);
        System.out.println(frogsim.hopDistance());
        System.out.println(frogsim.simulate());
        System.out.println(frogsim.runSimulations(400));
    }
}
