import java.io.FileNotFoundException;
import java.util.Scanner;

public class Basket {
    public static Menu cart = new Menu();
    static Customizations priceTag = new Customizations();
    static Scanner input = new Scanner(System.in);
    static UpdateBasket remover = new UpdateBasket();
    static int element = 0;


    public static void viewBasket(String[] basket) throws FileNotFoundException, InterruptedException {


        Payment pay = new Payment();
        System.out.println();

        for (int i = 0; i < basket.length; i++) {
            System.out.println(basket[i]);
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Are you ready to pay? press 1 for yes press 2 to go to the menu");
        try {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    pay.clarification(basket);
                    break;
                case 2:
                    Menu.menu();
                    break;
                default:
                    Menu.menu();
                    break;

            }
        } catch(Exception e){
            Menu.menu();
        }

    }
}
