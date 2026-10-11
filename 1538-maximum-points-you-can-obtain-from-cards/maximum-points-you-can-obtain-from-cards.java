class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int currentScore = 0;

        // Step 1: Take all k cards from the beginning
        for (int i = 0; i < k; i++) {
            currentScore += cardPoints[i];
        }

        int maxScore = currentScore;

        // Step 2: Move the window backward. 
        // Swap cards from the front with cards from the back one by one.
        for (int i = 0; i < k; i++) {
            currentScore -= cardPoints[k - 1 - i];   // Remove from front
            currentScore += cardPoints[n - 1 - i];   // Add from back
            maxScore = Math.max(maxScore, currentScore);
        }

        return maxScore;
    }
}
