public class MonteCarloSimulation {
    public static void main(String[] args) {

        final int TOTAL_THROWS = 1_000_000;
        int oddCount = 0;

        for (int i = 0; i < TOTAL_THROWS; i++) {

            // Random point in square [-1, 1] × [-1, 1]
            double x = Math.random() * 2 - 1;    //x^2 makes range 0 to 2 and -1 to -1 to 1
            double y = Math.random() * 2 - 1;

            // Check odd-numbered regions (1 and 3)
            if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
                oddCount++;
            }
        }

        double probability = (double) oddCount / TOTAL_THROWS;

        System.out.println("Probability of landing in an odd-numbered region: " + probability);
    }
}
