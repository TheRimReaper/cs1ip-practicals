import java.util.Scanner;
import java.util.Arrays;

public class CW1P4 {

    public static void main(String[] args) {
 

        Scanner input = new Scanner (System.in);
        //Taking user input on the array length
        System.out.println("How many values are you adding?");
        int NumCount = input.nextInt();
        
    
       
        int count = NumCount;

        int[] Plateau = new int[count];

        if (Plateau.length == 0) {
            System.out.println("0");
            return;
        }if (Plateau.length < 4) {
            System.out.println("0");
            return;
        }

        int i = 0;
        //Making Array as big as user wants
        while (i < count){
            System.out.println("Enter a number");
            Plateau[i] = input.nextInt(); 
            i = i + 1;
        }
        
        input.close();

       
        
        
    
  
    }

    static int longestPlateau(int[] terrain) {
    int j = 0;
    int longest = 0;

    Arrays.sort(terrain);
    //The counter loops when there is the same element in a row, then prints, then resets for the next different element.
    while (j < terrain.length) {
        int amount = terrain[j];
        int counter = 0;
        while (j < terrain.length && terrain[j] == amount) {
            j = j + 1;
            counter = counter + 1;
        }
        System.out.println(amount + ": " + counter);
        if (counter > longest) {
            longest = counter;
        }
    }
    return longest;
}
}
