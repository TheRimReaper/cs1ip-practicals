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

        int i = 0;
        //Making Array as big as user wants
        while (i < count){
            System.out.println("Enter a number");
            Plateau[i] = input.nextInt(); 
            i = i + 1;
        }
        
        input.close();

        int j = 0;
       
      

        Arrays.sort(Plateau);
        //Counter loops when there is the same element in a row, then prints, then resets for the next different element.
        while (j < count) {
            int amount = Plateau[j];
            int counter = 0;
            while (j < count && Plateau[j] == amount) {
                j = j + 1;
                counter = counter + 1;
                }
                System.out.println(amount + ": " + counter);
}
        
        
    
    }
}