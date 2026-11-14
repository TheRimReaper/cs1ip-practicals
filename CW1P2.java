import java.util.Scanner;

public class CW1P2 {
    public static void main(String[] args) {
        int StrawberryPrice = 02;
        int ChocolatePrice = 35;
        int VanillaPrice = 10;
        int ConePrice = 100;

        Scanner input = new Scanner(System.in);
        System.out.println("What flavour ice cream would you like? (s)trawberry, (c)hocolate or (v)anilla.");
        String flavour = input.next();
    

        if (!flavour.equals("s") || !flavour.equals("v") || !flavour.equals("c")) {
            System.out.println("We don't have that flavour.");
            System.exit(0);
        }

        System.out.println("How many scoops would you like?");
        int scoopsNum = input.nextInt();

       
        if (flavour.equals("s")) {
            if (0 < scoopsNum && scoopsNum <= 3 ) {
                int StrawberryTotal = StrawberryPrice * scoopsNum + ConePrice;
                System.out.println("That will be " + StrawberryTotal +  "p please.");
            }
            if (scoopsNum == 0){
                System.out.println("We don't sell just the cone.");
            }
            if (scoopsNum > 3){
                System.out.println("That's too many scoops to fit in a cone.");
            }
        }


        
        if (flavour.equals("c")) {
            if (0 < scoopsNum && scoopsNum <= 3 ) {
                int ChocolateTotal = ChocolatePrice * scoopsNum + ConePrice;
                System.out.println("That will be " + ChocolateTotal +  "p please.");
            }
            if (scoopsNum == 0){
                System.out.println("We don't sell just the cone.");
            }
            if (scoopsNum > 3){
                System.out.println("That's too many scoops to fit in a cone.");
            }
        }

        if (flavour.equals("v")) {
            if (0 < scoopsNum && scoopsNum <= 3 ) {
                int VanillaTotal = VanillaPrice * scoopsNum + ConePrice;
                System.out.println("That will be " + VanillaTotal +  "p please.");
            }
            if (scoopsNum == 0){
                System.out.println("We don't sell just the cone.");
            }
            if (scoopsNum > 3){
                System.out.println("That's too many scoops to fit in a cone.");
            }
        }
      
    
    }
       
}