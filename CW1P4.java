import java.util.Scanner;

public class CW1P4 {
    static int longestPlateau(int[] terrain){

        Scanner input = new Scanner (System.in);

        System.out.println("How many values are you adding?");
        int NumCount = input.nextInt();
        

        int count = NumCount;

        int[] Plateau = new int[count];

        int i = 0;

        while (i < count){
            System.out.println("Enter a number");
            Plateau[i] = input.nextInt(); 
            i = i + 1;
            System.out.println(Plateau);
        }
        input.close();
        return NumCount;
    }
}