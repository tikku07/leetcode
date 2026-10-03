class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // 1. Transpose the matrix correctly (swap matrix[i][j] with matrix[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // 2. Reverse each row to complete the 90-degree clockwise rotation
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            
            while (start < end) {
         
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                
                start++;
                end--;
            }
        }
    }
}
