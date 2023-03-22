import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Payment {
    static String fName = null;
    static String location = null;
    static String lName = null;
    static String time = null;
    static String card = null;
    static String cardNumber = null;
    static String cvv = null;
    static double tax = 0;
    static double finalCost = 0;
    static String bask = null;
    static double subTotal = 0.0;


    public void clarification(String[] basket) throws FileNotFoundException, InterruptedException {
        try {
            int shorts = 0; // 3.50
            int tall = 0; //4.00
            int grande = 0; // 4.50
            int venti = 0; //500
            int proteinBox = 0; // 5.00
            int snacks = 0; // 2.00
            int food = 0; //4.0
            String line = "";
            Location locate = new Location();
            Customizations totalPrice = new Customizations();
            Basket cart = new Basket();
            Scanner input = new Scanner(System.in);
            System.out.println("Please verify that the following is correct?\n");
            File tempReceipt = new File("tempr.txt");
            PrintWriter temp = new PrintWriter(new FileOutputStream(tempReceipt));
            for (int i = 0; i < basket.length; i++) {
                System.out.println(basket[i]);
                bask += basket[i];
                temp.println(basket[i]);
            }
            bask = bask.replaceAll("null", "");
            temp.close();

            Scanner tempScan = new Scanner(tempReceipt);

            while (tempScan.hasNextLine()) {
                line = tempScan.nextLine();
                if (line.contains("Short")) {
                    shorts++;
                }
                if (line.contains("Tall")) {
                    tall++;
                }
                if (line.contains("Grande")) {
                    grande++;
                }
                if (line.contains("proteinbox")) {
                    proteinBox++;
                }
                if (line.contains("snacks")) {
                    snacks++;
                }
                if (line.contains("food")) {
                    food++;
                }
                if (line.contains("Venti")) {
                    venti++;
                }

            }

            // this erases anything in that file
            temp = new PrintWriter(new FileOutputStream(tempReceipt));
            temp.println();
            temp.close();


            subTotal = (shorts * 3.50) + (tall * 4.00) + (grande * 4.50) + (venti * 5.00) + (proteinBox * 5.00) + (snacks * 2.00) + (food * 4.00);
            tax = (subTotal * .08);
            finalCost = tax + subTotal;
            System.out.println("The subtotal is: " + subTotal);
            System.out.println("Tax: " + tax);
            System.out.println("The total cost is: " + finalCost);
            System.out.println("Is the following correct? 1 for yes 2 for no");
            int correct = input.nextInt();
            Scanner tim = new Scanner(System.in);
            Location place = new Location();
            switch (correct) {
                case 1:
                    location = place.findLocation();
                    System.out.println("Please enter the time you will pick up your order");
                    System.out.println("Must be in 00:00 12 hour format.");
                    System.out.println("Please enter am or pm at the end.");
                    time = tim.nextLine();

                    paying();
                    break;
                case 2:
                    cart.viewBasket(basket);
                    break;
                default:
                    cart.viewBasket(basket);
                    break;
            }
        }
        catch(Exception e ){
            clarification(basket);
        }

    }

    public static void paying() throws FileNotFoundException {
        try {
            Scanner userInput = new Scanner(System.in);

            System.out.println("What is your first name?");
            fName = userInput.nextLine();

            System.out.println("What is your last name?");
            lName = userInput.nextLine();

            String junk = userInput.nextLine();

            System.out.println("What is your credit card type?");
            System.out.println(" (1) Mastercard? (2) Visa?");
            int cardtype = (int) userInput.nextInt();
            if (cardtype == 1) {
                card = "Mastercard";
            } else if (cardtype == 2) {
                card = "Visa";
            } else {
                paying();
            }
            junk = userInput.nextLine();
            System.out.println("Please enter card number");
            cardNumber = userInput.nextLine();

            System.out.println("Please enter CVV");
            cvv = userInput.nextLine();
            System.out.println("");

            printReceipt();
        }
        catch (Exception e){
            paying();
        }


    }

    public static void printReceipt() throws FileNotFoundException {
        String fileName = fName + " " + lName + "'s Receipt";
        String fileNamePlus = fileName + ".txt";
        File printFile = new File(fileNamePlus);
        PrintWriter printReceipt = new PrintWriter(new FileOutputStream(printFile));

        System.out.println(fileName);
        System.out.println("");
        System.out.println(bask);
        System.out.println("");
        System.out.println("subtotal: " + subTotal);
        System.out.println("tax: " + tax);
        System.out.println("Total: " + finalCost);
        System.out.println("\n\n");
        System.out.println("Your pick will be ready at " + time + " at the location: " + location);


        printReceipt.println(fileName);
        printReceipt.println("");
        printReceipt.println(bask);
        printReceipt.println("");
        printReceipt.println("subtotal: " + subTotal);
        printReceipt.println("tax: " + tax);
        printReceipt.println("Total: " + finalCost);
        printReceipt.println("\n\n");
        printReceipt.println("Your pick will be ready at " + time + " at the location: " + location);
        printReceipt.close();

    }

}
