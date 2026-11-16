import java.util.Scanner;

public class CW1P5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a matrix size (n):");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Please enter the elements of the matrix row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Number of peaks: " + countPeaks(matrix));

        input.close();

    }

 static int countPeaks(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        
        int[] dr = {-1, 1, 0, 0}; // dr[0] + dc[0] = -1,0. Which is up. dr[2] + dc[2] = 0,-1. Which is left.
        int[] dc = {0, 0, -1, 1};

        int PeakAmount = 0;

        int count = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                boolean isPeak = true; //Boolean to increment 'count' when it is true

                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d]; //Incremenets to check each position of the neighbour
                    int nc = c + dc[d];

                    
                    if (nr < 0 || nr >= rows || nc < 0 || nc >= cols) {
                        continue;
                    }

                    
                    if (grid[nr][nc] >= grid[r][c]) {
                        isPeak = false; // If neighbouring value is more than or equal to current value, then it's not a peak
                        break;
                    }
                }

                if (isPeak) {
                    count++; // Increment the count of peaks
                    PeakAmount++;

                }
            }
        }

    
        return PeakAmount;
    }
    
}
