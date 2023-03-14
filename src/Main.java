public class Main {
    public static void main(String[] args) {

        int startingScore = 100;
        int replenishment = 1100;
        int bonus = replenishment / startingScore;
        int finalScore = startingScore + replenishment + bonus;
        if (replenishment < 1000) {
            System.out.println(startingScore + replenishment);
        } else {
            System.out.println(bonus);
            System.out.println(finalScore);
        }
    }
}