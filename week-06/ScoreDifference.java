import java.util.*;

public class ScoreDifference {
    public static void main(String[] args) {
        Map<String, Integer> originalScores = new HashMap<>();
        originalScores.put("Alice", 90);
        originalScores.put("Bob", 85);
        originalScores.put("Charlie", 95);
        Map<String, Integer> penaltyPoints = new HashMap<>();
        penaltyPoints.put("Alice", 10);
        penaltyPoints.put("Bob", 5);
        penaltyPoints.put("David", 3);
        Map<String, Integer> finalScores = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : penaltyPoints.entrySet()) {
            // LINE 1: Fill in the code
            finalScores.merge(entry.getKey(), entry.getValue(), (score, penalty) -> score
                    - penalty);
        }
        System.out.println(finalScores);
    }
}