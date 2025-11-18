public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public FrogSimulation (){
    }
    public FrogSimulation (int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }
    public int hopDistance(){
        int x = 0;
        x = (int) (Math.random() * 21 - 5);
//        x = (int) (Math.random() * Integer.MAX_VALUE - (Integer.MAX_VALUE/2));
        return x;
    }
    public boolean simulate (){
        int dist = 0;
        int hops = 0;
        while (dist < goalDistance){
            hops++;
            dist = dist + hopDistance();
        }
        if (hops < maxHops){
            return true;
        }else {
            return false;
        }
    }
    public double runSimulations (int num){
        double score = 0;
        double score1 = 0;
        double score2 = 0;
        for (int i = 0; i < num; i++){
            score2++;
            if (simulate() == true){
                score1++;
            }
        }
        score = score1 / score2;
        return score;
    }
}
