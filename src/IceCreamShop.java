import java.util.ArrayList;
import java.util.Scanner;

public class IceCreamShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Ice Cream Shop!");

        System.out.println("How many orders will you place today?");
        int numOrders = Integer.parseInt(scan.nextLine());
        ArrayList<IceCreamOrder> iceCreamOrderList = new ArrayList<IceCreamOrder>();

        for(int i = 0; i < numOrders; i++) {
            // Read in each order
            System.out.println("Order #" + (i+1));
            System.out.println("Is this order allowed to contain nuts? y/n");
            String nutsString = scan.nextLine();
            boolean orderAllowedToHaveNuts = nutsString.equalsIgnoreCase("y");

            // give flavor choices
            System.out.println("Here are your flavor choices:");
            Flavor[] flavorChoices = Flavor.values();
            for(Flavor flavorChoice : flavorChoices) {
                boolean flavorHasNuts = !flavorChoice.isNutFree();
                if(orderAllowedToHaveNuts || !flavorHasNuts){
                    System.out.println(flavorChoice.ordinal() + ". " + flavorChoice);
                }
                System.out.println("Enter the flavor number.");
                int flavorNumber = Integer.parseInt(scan.nextLine());

                System.out.println("How many scoops?");
                int scoops = Integer.parseInt(scan.nextLine());

                IceCreamOrder order = new IceCreamOrder(scoops, Flavor.values()[flavorNumber]);


            }

            // get the flavor number they want:
            System.out.println("Enter flavor number:");
            int flavorNumber = Integer.parseInt(scan.nextLine());


        }

        System.out.println("Thank you for your order.  Here is your summary");
        System.out.println(iceCreamOrderList);
        System.out.println("You ordered a total of " + IceCreamOrder.getTotalNumberScoops() + " scoops");
        System.out.println("Good-bye");





    }
}
