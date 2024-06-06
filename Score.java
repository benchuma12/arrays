
public class Score {

 
    public static void main(String[] args) {
                int[] scores = {81, 90, 78, 92, 88};

        // Calculate sum
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        // Calculate average
        double average = (double) sum / 5;

        // Print the results
        System.out.println("Sum of scores: " + sum);
        System.out.println("Average of scores: " + average);
    }
    
}
