import java.util.Scanner;
import java.util.Arrays;

public class CW1P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students are there?");
        int m = input.nextInt();

        System.out.println("How many assessment components are there?");
        int n = input.nextInt();

        int[][] MatrixGrade = new int[m][n];

        for (int i = 0; i < m; i++) {
            System.out.println("Enter the " + n + " grades for student " + (i + 1) + ":");//Stores the grades of each student within the row of the 2D array
            for (int j = 0; j < n; j++) {
                MatrixGrade[i][j] = input.nextInt();
            }
        }

        int[] MatrixWeight = new int[n];

        System.out.println("What is the weight of each component? (should add up to 100)");
        for (int j = 0; j < n; j++) {
            MatrixWeight[j] = input.nextInt(); // Storing grades' weights
        }

        int[] averages = average_grades(MatrixGrade, MatrixWeight);//Storing Arrays for next method
        System.out.println("Weighted averages: " + Arrays.toString(averages));

        input.close();
    }

    static int[] average_grades(int grades[][], int weights[]) {
        int[] result = new int[grades.length]; //Product of the 2 arrays

        for (int k = 0; k < grades.length; k++) {
            int total = 0;
            for (int l = 0; l < weights.length; l++) {
                total += grades[k][l] * weights[l]; // Each weighted grade is added to 'result' in order
            }
            result[k] = total / 100;
        }

        return result;
    }
}