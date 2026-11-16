import java.util.Scanner;
import java.util.Arrays;

public class CW1P6{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);


        

        System.out.println("How many grades are there for this module?");
        int m = input.nextInt();

        System.out.println("How many modules are there?");
        int n = input.nextInt();

        int[][] MatrixGrade = new int[m][n];

        for (int i = 0; i < m; i++) {
            System.out.println("Enter the " + n + " grades for student :");
            for (int j = 0; j < n; j++) {
                MatrixGrade[i][j] = input.nextInt();
        }
        }
    
        




        int[] MatrixWeight = new int[n];

        System.out.println("What is the weight of each module?");
        for (int i = 0; i < n; i++){
            MatrixWeight[i] = input.nextInt();
        }


input.close();

       

           
    }
        }