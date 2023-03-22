import java.util.*;

public class Customizations {
    static Scanner userInput = new Scanner(System.in);
    static String customizationReturner = null;
    static String sizeString = null;
    public static double totalCost = 0;
    static double itemPrice = 0;
    public static String itemPriceString = null;
    static String teaCustomizationsString = null;
    static final double Short = 3.50;
    static final double Tall = 4.00;
    static final double Grande = 4.50;
    static final double Venti = 5.00;

    public static String sizeconfigOne() {
        try {
            int size = 0;

            userInput.nextLine();
            System.out.println("What size drink do you want?");
            System.out.println("Short (1) Tall (2) Grande (3) Venti (4)");
            size = userInput.nextInt();

            switch (size) {
                case 1:
                    sizeString = "Short";
                    itemPriceString = "\t\t\t\t\t\t\t\t\t\t$3.50";
                    break;
                case 2:
                    sizeString = "Tall";
                    itemPriceString = "\t\t\t\t\t\t\t\t\t\t$4.00";
                    break;
                case 3:
                    sizeString = "Grande";
                    itemPriceString = "\t\t\t\t\t\t\t\t\t\t$4.50";
                    break;
                case 4:
                    sizeString = "Venti";
                    itemPriceString = "\t\t\t\t\t\t\t\t\t\t$5.00";
                    break;
                default:
                    System.out.println("Default will be short");
                    sizeString = "Short";
                    itemPriceString = "\t\t\t\t\t\t\t\t\t\t$3.50";
                    break;
            }
        }
        catch(Exception e){
            sizeconfigOne();
        }
        return sizeString;
    }


    //This is used for pretty much all the drinks (except the cold stuff)
    public static String hotcofCustomization() {
        //This method is the customize options for the hot coffees.
        //This will combine a bunch of strings and then return it back to the method.
        try {
            //These are the flavors
            int brownSugarSyrup = 0;
            int caramelSyrup = 0;
            int cinnamonDolceSyrup = 0;
            int hazelnutSyrup = 0;
            int pepermintSyrup = 0;
            int raspberrySyrup = 0;
            int toastedVanillaSyrup = 0;
            int toffeeNutSyrup = 0;
            int vanillaSyrup = 0;
            int sugarFreeVanillaSyrup = 0;
            int mochaSauce = 0;
            int darkCaramelSauce = 0;
            int pistachioSauce = 0;
            int whiteChocolateMochaSauce = 0;
            int chai = 0;
            customizationReturner = null;

            userInput.nextLine();


            //These are the flavors
            System.out.println("How many pumps of brown sugar syrup do you want?");
            brownSugarSyrup = (int) userInput.nextInt();

            System.out.println("How many pumps of caramel syrup do you want?");
            caramelSyrup = (int) userInput.nextInt();

            System.out.println("How many pumps of cinnamon dolce syrup do you want?");
            cinnamonDolceSyrup = (int) userInput.nextInt();

            System.out.println("How many pumps of hazelnut syrup do you want?");
            hazelnutSyrup = (int) userInput.nextInt();

            System.out.println("How many pumps of perpermint syrup do you want?");
            pepermintSyrup = (int) userInput.nextInt();

            System.out.println("How many pumps of raspberry syrup do you want?");
            raspberrySyrup = (int) userInput.nextInt();

            System.out.println("How many pumps of toasted vanilla syrup do you want?");
            toastedVanillaSyrup = (int) userInput.nextInt();

            System.out.println("How many pumps of toffee nut syrup do you want?");
            toffeeNutSyrup = (int) userInput.nextInt();

            System.out.println("How many pumps of vanilla syrup do you want ?");
            vanillaSyrup = (int) userInput.nextInt();

            System.out.println("How many pumps of sugar free vanilla syrup do you want?");
            sugarFreeVanillaSyrup = (int) userInput.nextInt();

            System.out.println("How many pumps of mocha sauce do you want?");
            mochaSauce = (int) userInput.nextInt();

            System.out.println("How many pumps of dark caramel sauce do you want?");
            darkCaramelSauce = (int) userInput.nextInt();

            System.out.println("How many pumps of pistachio sauce do you want?");
            pistachioSauce = (int) userInput.nextInt();

            System.out.println("How many pumps of white chocolate mocha sauce do you want?");
            whiteChocolateMochaSauce = (int) userInput.nextInt();

            System.out.println("How many pumps of chai do you want?");
            chai = (int) userInput.nextInt();

            if (brownSugarSyrup != 0) {
                customizationReturner += ("\tBrown Sugar Syrup Pumps: " + brownSugarSyrup + "\n");
            }
            if (caramelSyrup != 0) {
                customizationReturner += ("\tCaramel Syrups Pumps: " + caramelSyrup + "\n");
            }
            if (cinnamonDolceSyrup != 0) {
                customizationReturner += ("\tCinnamon Dolce Syrup Pumps: " + cinnamonDolceSyrup + "\n");
            }
            if (hazelnutSyrup != 0) {
                customizationReturner += ("\tHazelnut Syrup Pumps: " + hazelnutSyrup + "\n");
            }
            if (pepermintSyrup != 0) {
                customizationReturner += ("\tPeppermint Syrup Pumps: " + pepermintSyrup + "\n");
            }
            if (raspberrySyrup != 0) {
                customizationReturner += ("\tRaspberry Syrup Pumps: " + raspberrySyrup + "\n");
            }
            if (toastedVanillaSyrup != 0) {
                customizationReturner += ("\tToasted Vanilla Syrup Pumps: " + toastedVanillaSyrup + "\n");
            }
            if (toffeeNutSyrup != 0) {
                customizationReturner += ("\tToffee Nut Syrup Pumps: " + toffeeNutSyrup + "\n");
            }
            if (vanillaSyrup != 0) {
                customizationReturner += ("\tVanilla Syrup Pumps: " + vanillaSyrup + "\n");
            }
            if (sugarFreeVanillaSyrup != 0) {
                customizationReturner += ("\tSugar Free Vanilla Syrup Pumps: " + sugarFreeVanillaSyrup + "\n");
            }
            if (mochaSauce != 0) {
                customizationReturner += ("\tMocha Sauce Pumps: " + mochaSauce + "\n");
            }
            if (darkCaramelSauce != 0) {
                customizationReturner += ("\tDark Caramel Sauce Pumps: " + darkCaramelSauce + "\n");
            }
            if (pistachioSauce != 0) {
                customizationReturner += ("\tPistachio Sauce Pumps: " + pistachioSauce + "\n");
            }
            if (whiteChocolateMochaSauce != 0) {
                customizationReturner += ("\tWhite Chocolate Mocha Sauce Pumps: " + whiteChocolateMochaSauce + "\n");
            }
            if (chai != 0) {
                customizationReturner += ("\tChai Pumps: " + chai + "\n");
            }


            //These are the toppings
            userInput.nextLine();
            int cinnamonDolceSprinkles = 0;
            int caramelDrizzle = 0;
            int mochaDrizzle = 0;
            int cinnamonPowerder = 0;
            int whippedCream = 0;
            int coldFoam = 0;
            int saltedCaramelCreamColdFoam = 0;
            int vanillaSweetCreamColdFoam = 0;

            System.out.println("Do you want Cinnamon Dolce Sprinkles?");
            System.out.println("1 for none, 2 for light, 3 for extra");
            cinnamonDolceSprinkles = (int) userInput.nextInt();

            switch (cinnamonDolceSprinkles) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tLight Cinnamon Dolce Sprinkles\n";
                    break;
                case 3:
                    customizationReturner += "\tExtra Cinnamon Dolce Sprinkles\n";
                    break;
                default:
                    System.out.println("You picked a number that's not these options.");
                    System.out.println("The default will be none.");
                    break;
            }

            System.out.println("Do you want Caramel Drizzle?");
            System.out.println("1 for none, 2 for light, 3 for extra");
            caramelDrizzle = (int) userInput.nextInt();

            switch (caramelDrizzle) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tLight Caramel Drizzle\n";
                    break;
                case 3:
                    customizationReturner += "\tExtra Caramel Drizzle\n";
                    break;
                default:
                    System.out.println("You picked a number that's not these options.");
                    System.out.println("The default will be none.");
                    break;
            }

            System.out.println("Do you want Mocha Drizzle?");
            System.out.println("1 for none, 2 for light, 3 for extra");
            mochaDrizzle = (int) userInput.nextInt();

            switch (mochaDrizzle) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tLight Mocha Drizzle\n";
                    break;
                case 3:
                    customizationReturner += "\tExtra Mocha Drizzle\n";
                    break;
                default:
                    System.out.println("You picked a number that's not these options.");
                    System.out.println("The default will be none.");
                    break;
            }

            System.out.println("Do you want Cinnamon Powerder?");
            System.out.println("1 for none, 2 for light, 3 for extra");
            cinnamonPowerder = (int) userInput.nextInt();

            switch (cinnamonPowerder) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tLight Cinnamon Powder\n";
                    break;
                case 3:
                    customizationReturner += "\tExtra Cinnamon Powder\n";
                    break;
                default:
                    System.out.println("You picked a number that's not these options.");
                    System.out.println("The default will be none.");
                    break;
            }

            System.out.println("Do you want Whipped Cream?");
            System.out.println("1 for none, 2 for light, 3 for extra");
            whippedCream = (int) userInput.nextInt();

            switch (whippedCream) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tLight Whipped Cream\n";
                    break;
                case 3:
                    customizationReturner += "\tExtra Whipped Cream\n";
                    break;
                default:
                    System.out.println("You picked a number that's not these options.");
                    System.out.println("The default will be none.");
                    break;
            }

            System.out.println("Do you want Cold Foam?");
            System.out.println("1 for none, 2 for light, 3 for extra");
            coldFoam = (int) userInput.nextInt();

            switch (coldFoam) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tLight Cold Foam\n";
                    break;
                case 3:
                    customizationReturner += "\tExtra Cold Foam\n";
                    break;
                default:
                    System.out.println("You picked a number that's not these options.");
                    System.out.println("The default will be none.");
                    break;
            }

            System.out.println("Do you want Salted caramel Cream Cold Foam?");
            System.out.println("1 for none, 2 for light, 3 for extra");
            saltedCaramelCreamColdFoam = (int) userInput.nextInt();

            switch (saltedCaramelCreamColdFoam) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tLight Salted caramel Cream Cold Foam\n";
                    break;
                case 3:
                    customizationReturner += "\tExtra Salted caramel Cream Cold Foam\n";
                    break;
                default:
                    System.out.println("You picked a number that's not these options.");
                    System.out.println("The default will be none.");
                    break;
            }

            System.out.println("Do you want Vanilla Sweet Cream Cold Foam?");
            System.out.println("1 for none, 2 for light, 3 for extra");
            vanillaSweetCreamColdFoam = (int) userInput.nextInt();

            switch (vanillaSweetCreamColdFoam) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tLight Vanilla Sweet Cream Cold Foam\n";
                    break;
                case 3:
                    customizationReturner += "\tExtra Vanilla Sweet Cream Cold Foam\n";
                    break;
                default:
                    System.out.println("You picked a number that's not these options.");
                    System.out.println("The default will be none.");
                    break;
            }

            //Now this is Sweetners
            userInput.nextLine();
            int sugar = 0;
            int sugarRaw = 0;
            int honey = 0;
            int splenda = 0;
            int steviaRaw = 0;
            int classicSyrup = 0;
            int caneSugar = 0;
            int honeyBlend = 0;

            System.out.println("How many pumps/packets of sugar do you want?");
            sugar = userInput.nextInt();

            System.out.println("How many pumps/packets of Sugar in the Raw do you want?");
            sugarRaw = userInput.nextInt();

            System.out.println("How many pumps/packets of Honey do you want");
            honey = userInput.nextInt();

            System.out.println("How many pumps/packets of splenda do you want?");
            splenda = userInput.nextInt();

            System.out.println("How many pumps/packets of Stevia in the Raw do you wnat?");
            steviaRaw = userInput.nextInt();

            System.out.println("How many pumps/packets of Classic Syrup do you want?");
            classicSyrup = userInput.nextInt();

            System.out.println("How many pumps/packets of Cane Sugar do you want?");
            caneSugar = userInput.nextInt();

            System.out.println("How many pumps/packets of Honey Blend do you want?");
            honeyBlend = userInput.nextInt();

            if (sugar != 0) {
                customizationReturner += "\tSugar: " + sugar + "\n";
            }
            if (sugarRaw != 0) {
                customizationReturner += "\tSugar in the Raw: " + sugarRaw + "\n";
            }
            if (honey != 0) {
                customizationReturner += "\tHoney: " + honey + "\n";
            }
            if (splenda != 0) {
                customizationReturner += "\tSplenda: " + splenda + "\n";
            }
            if (steviaRaw != 0) {
                customizationReturner += "\tStevia in the Raw: " + steviaRaw + "\n";
            }
            if (classicSyrup != 0) {
                customizationReturner += "\tClassic Syrup: " + classicSyrup + "\n";
            }
            if (caneSugar != 0) {
                customizationReturner += "\tCane Sugar: " + caneSugar + "\n";
            }
            if (honeyBlend != 0) {
                customizationReturner += "\tHoney Blend: " + honeyBlend + "\n";
            }

            //These are the add-ins
            userInput.nextLine();
            int splashOneMilk = 0;
            int splashTwoMilk = 0;
            int splashAlmondMilk = 0;
            int splashCoconutMilk = 0;
            int splashCreamHH = 0;
            int splashHeavyCream = 0;
            int splashNonFatMilk = 0;
            int splashOatmilk = 0;
            int splashSoyMilk = 0;
            int splashwholeMilk = 0;
            int splashWholeMilk = 0;
            int splashSweetCream = 0;

            System.out.println("Do you want 1% Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashOneMilk = (int) userInput.nextInt();

            switch (splashOneMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little 1% milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra 1% milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want 2% Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashTwoMilk = (int) userInput.nextInt();

            switch (splashTwoMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little 2% milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra 2% milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Almond Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashAlmondMilk = (int) userInput.nextInt();

            switch (splashAlmondMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little almond milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra almond milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Coconut Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashCoconutMilk = (int) userInput.nextInt();

            switch (splashCoconutMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little coconut milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra coconut milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Cream (Half & Half)?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashCreamHH = (int) userInput.nextInt();

            switch (splashCreamHH) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little Half & Half\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra Half & Half\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Heavy Cream?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashHeavyCream = (int) userInput.nextInt();

            switch (splashHeavyCream) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little heavy cream\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra heavy cream\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Nonfat Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashNonFatMilk = (int) userInput.nextInt();

            switch (splashNonFatMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little nonfat milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra nonfat milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Oat Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashOatmilk = (int) userInput.nextInt();

            switch (splashOatmilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little oat milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra oat milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Soy Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashSoyMilk = (int) userInput.nextInt();

            switch (splashSoyMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little soy milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra soy milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Whole Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashWholeMilk = (int) userInput.nextInt();

            switch (splashWholeMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little whole milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra whole milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Sweet Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashSweetCream = (int) userInput.nextInt();

            switch (splashSweetCream) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little sweet milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra sweet milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            //Espresso & shot options
            userInput.nextLine();
            int shots = 0;
            int espress = 0;
            int rsl = 0;

            System.out.println("How many shots do you want?");
            shots = (int) userInput.nextInt();
            if (shots != 0) {
                customizationReturner += ("\tAdd: " + shots + " shots\n");
            }

            System.out.println("What Espresso Roast Option do you want?");
            System.out.println("1 for Signature , 2 for Blonde, 3 for Decaf, 4 for 1/3 Decaf");
            System.out.println("5 for 1/2 Decaf, 6 for 2/3 Decaf");
            espress = (int) userInput.nextInt();

            switch (espress) {
                case 1:
                    customizationReturner += "\tSignature Espresso\n";
                    break;
                case 2:
                    customizationReturner += "\tBlonde Espresso\n";
                    break;
                case 3:
                    customizationReturner += "\tDecaf Espresso\n";
                    break;
                case 4:
                    customizationReturner += "\t1/3 Decaf Espresso\n";
                    break;
                case 5:
                    customizationReturner += "\t1/2 Decaf Espresso\n";
                    break;
                case 6:
                    customizationReturner += "\t2/3 Decaf Espresso\n";
                    break;
                default:
                    System.out.println("Default is Signature;");
                    customizationReturner += "\tSignature Espresso\n";
                    break;
            }

            System.out.println("Do you want Ristretto (1) or Long Shot (2)");
            rsl = userInput.nextInt();

            switch (rsl) {
                case 1:
                    customizationReturner += "\tRistretto\n";
                    break;
                case 2:
                    customizationReturner += "\tLong Shot\n";
                    break;
                default:
                    customizationReturner += "\tRistretto\n";
                    break;
            }

        }catch(Exception e){
            hotcofCustomization();
        }
        return customizationReturner;
    }

    //This needs to be added to all teas
    public static String teaCustomizations() {
        try {
            customizationReturner = null;
            int chaiPump = 0;
            int matchaPowder = 0;
            int teaBags = 0;
            int water = 0;

            System.out.println("How many pumps of Chai do you want?");
            chaiPump = userInput.nextInt();

            System.out.println("How many scoops of Matcha Powder do you want?");
            matchaPowder = userInput.nextInt();

            System.out.println("How many bags of Tea do you want?");
            teaBags = userInput.nextInt();

            if (chaiPump != 0) {
                teaCustomizationsString += "\tAdd " + chaiPump + " pumps of chai\n";
            }
            if (matchaPowder != 0) {
                teaCustomizationsString += "\tAdd " + matchaPowder + " scoops of matcha powder\n";
            }
            if (teaBags != 0) {
                teaCustomizationsString += "\tAdd " + teaBags + " tea bags\n";
            }

            System.out.println("How much water do you want to add?");
            System.out.println("1 for no water 2 for light water 3 for extra water");
            water = userInput.nextInt();

            switch (water) {
                case 1:
                    break;
                case 2:
                    teaCustomizationsString += "\tAdd little water\n";
                    break;
                case 3:
                    teaCustomizationsString += "\tAdd extra water\n";
                    break;
                default:
                    break;
            }
        }catch (Exception e){
            teaCustomizations();
        }
        return teaCustomizationsString;
    }

    public static String coldCof() {
        try {
            customizationReturner = null;
            System.out.println("How much ice do you want?");
            System.out.println("1 for none 2 for light 3 for extra");
            int howMuchIce = userInput.nextInt();

            switch (howMuchIce) {
                case 1:
                    break;
                case 2:
                    customizationReturner = "\tlight ice\n";
                    break;
                case 3:
                    customizationReturner = "\textra ice\n";
                    break;
                default:
                    break;
            }

            System.out.println("How much lemonade do you want?");
            System.out.println("1 for none 2 for light 3 for extra");
            int lemonade = userInput.nextInt();

            switch (lemonade) {
                case 1:
                    break;
                case 2:
                    customizationReturner = "\tlight lemonade\n";
                    break;
                case 3:
                    customizationReturner = "\textra lemonade\n";
                    break;
                default:
                    break;
            }
            System.out.println("How much room do you want?");
            System.out.println("1 for none 2 for light 3 for extra");
            int room = userInput.nextInt();

            switch (room) {
                case 1:
                    break;
                case 2:
                    customizationReturner = "\tlight room\n";
                    break;
                case 3:
                    customizationReturner = "\textra room\n";
                    break;
                default:
                    break;
            }
        }catch(Exception e){
            coldCof();
        }
        return customizationReturner;
    }

    public static String coldDCustomizations() {
        try {
            customizationReturner = null;
            teaCustomizationsString = null;
            System.out.println("How many scoops of Dragonfruit Inclusion do you want?");
            int dfl = userInput.nextInt();

            if (dfl != 0) {
                teaCustomizationsString += "\tAdd " + dfl + " scoops of dragonfruit inclusion\n";
            }

            System.out.println("How many scoops of Strawberries do you want?");
            int stawberries = userInput.nextInt();

            if (stawberries != 0) {
                teaCustomizationsString += "\tAdd " + stawberries + " scoops of strawberries\n";
            }

            System.out.println("How many scoops of Kiwi Inclusion do you want?");
            int kiwi = userInput.nextInt();

            if (kiwi != 0) {
                teaCustomizationsString += "\tAdd " + kiwi + " scoops of kiwi inclusion\n";
            }

            System.out.println("Stawberry Puree? 1 for none. 2 for light. 3 for extra");
            int strawpur = userInput.nextInt();

            switch (strawpur) {
                case 1:
                    break;
                case 2:
                    teaCustomizationsString += "\tlight strawberry puree\n";
                    break;
                case 3:
                    teaCustomizationsString += "\textra strawberry puree\n";
                    break;
                default:
                    break;
            }

            System.out.println("Ice? 1 for none. 2 for light. 3 for extra");
            int ice = userInput.nextInt();

            switch (ice) {
                case 1:
                    break;
                case 2:
                    teaCustomizationsString += "\tlight ice\n";
                    break;
                case 3:
                    teaCustomizationsString += "\textra ice\n";
                    break;
                default:
                    break;
            }
        }catch(Exception e){
            coldDCustomizations();
        }

        return teaCustomizationsString;
    }

    public static String breakSandOptions() {
        try {
            customizationReturner = null;
            System.out.println("Please note the default will add the following items: Cheese, eggs, and meat");
            System.out.println("Do you want cheese? 1 for yes 2 for no");
            int cheese = (int) userInput.nextInt();
            switch (cheese) {
                case 2:
                    customizationReturner += "\tno cheese\n";
                    break;
                default:
                    break;
            }

            System.out.println("Do you want eggs? 1 for yes 2 for no");
            int eggs = (int) userInput.nextInt();
            switch (eggs) {
                case 2:
                    customizationReturner += "\tno eggs\n";
                    break;
                default:
                    break;
            }

            System.out.println("Do you want meat? 1 for yes 2 for no");
            int meat = (int) userInput.nextInt();
            switch (cheese) {
                case 2:
                    customizationReturner += "\tno cheese\n";
                    break;
                default:
                    break;
            }

            System.out.println("Enter the number of packets of sirracha you want");
            int sirracha = (int) userInput.nextInt();
            if (sirracha != 0) {
                customizationReturner += "\tadd " + sirracha + " packets of sirracha";
            }
            customizationReturner = customizationReturner.replaceAll("null", "");
        }catch(Exception e){
            breakSandOptions();
        }
        return customizationReturner;
    }

    public static String bakeryCustomizations (int a){
        try {
            customizationReturner = null;
            // int 1 = spreads
            // int 2 = warmed
            // int 3 = both
            int temp = a;

            //This is for butter and plain cream cheese
            if (a == 1) {
                System.out.println("How much butter do you want?");
                int butter = (int) userInput.nextInt();
                if (butter != 0) {
                    customizationReturner += "\tadd " + butter + " of butter";
                }
            }
            //This is for wamred.
            else if (a == 2) {
                System.out.println("Warmed? 1 for yes 2 for no");
                int warmed = (int) userInput.nextInt();
                if (warmed == 1) {
                    customizationReturner += "\twarmed";
                }
            }
            //this is for both
            else if (a == 3) {

                System.out.println("How much butter do you want?");
                int butter = (int) userInput.nextInt();
                if (butter != 0) {
                    customizationReturner += "\tadd " + butter + " of butter";
                }

                System.out.println("Warmed? 1 for yes 2 for no");
                int warmed = (int) userInput.nextInt();
                if (warmed == 1) {
                    customizationReturner += "\twarmed";
                }

            } else {
                bakeryCustomizations(temp);
            }
            customizationReturner = customizationReturner.replaceAll("null", "");
        } catch(Exception e){
            bakeryCustomizations(a);
        }
        return customizationReturner;
    }

    public static String sirracha(){
        try {
            customizationReturner = null;
            System.out.println("Enter the number of packets of sirracha you want");
            int sirracha = (int) userInput.nextInt();
            if (sirracha != 0) {
                customizationReturner += "\tadd " + sirracha + " packets of sirracha";
            }
            customizationReturner = customizationReturner.replaceAll("null", "");
        }
        catch(Exception e){
            sirracha();
        }
        return customizationReturner;
    }

    public static String oats(){
        try {
            customizationReturner = null;
            int sugar = 0;
            int sugarRaw = 0;
            int honey = 0;
            int splenda = 0;
            int steviaRaw = 0;
            int classicSyrup = 0;
            int caneSugar = 0;
            int honeyBlend = 0;

            System.out.println("How many pumps/packets of sugar do you want?");
            sugar = userInput.nextInt();

            System.out.println("How many pumps/packets of Sugar in the Raw do you want?");
            sugarRaw = userInput.nextInt();

            System.out.println("How many pumps/packets of Honey do you want");
            honey = userInput.nextInt();

            System.out.println("How many pumps/packets of splenda do you want?");
            splenda = userInput.nextInt();

            System.out.println("How many pumps/packets of Stevia in the Raw do you wnat?");
            steviaRaw = userInput.nextInt();

            System.out.println("How many pumps/packets of Classic Syrup do you want?");
            classicSyrup = userInput.nextInt();

            System.out.println("How many pumps/packets of Cane Sugar do you want?");
            caneSugar = userInput.nextInt();

            System.out.println("How many pumps/packets of Honey Blend do you want?");
            honeyBlend = userInput.nextInt();

            if (sugar != 0) {
                customizationReturner += "\tSugar: " + sugar + "\n";
            }
            if (sugarRaw != 0) {
                customizationReturner += "\tSugar in the Raw: " + sugarRaw + "\n";
            }
            if (honey != 0) {
                customizationReturner += "\tHoney: " + honey + "\n";
            }
            if (splenda != 0) {
                customizationReturner += "\tSplenda: " + splenda + "\n";
            }
            if (steviaRaw != 0) {
                customizationReturner += "\tStevia in the Raw: " + steviaRaw + "\n";
            }
            if (classicSyrup != 0) {
                customizationReturner += "\tClassic Syrup: " + classicSyrup + "\n";
            }
            if (caneSugar != 0) {
                customizationReturner += "\tCane Sugar: " + caneSugar + "\n";
            }
            if (honeyBlend != 0) {
                customizationReturner += "\tHoney Blend: " + honeyBlend + "\n";
            }

            //These are the add-ins
            userInput.nextLine();
            int splashOneMilk = 0;
            int splashTwoMilk = 0;
            int splashAlmondMilk = 0;
            int splashCoconutMilk = 0;
            int splashCreamHH = 0;
            int splashHeavyCream = 0;
            int splashNonFatMilk = 0;
            int splashOatmilk = 0;
            int splashSoyMilk = 0;
            int splashwholeMilk = 0;
            int splashWholeMilk = 0;
            int splashSweetCream = 0;

            System.out.println("Do you want 1% Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashOneMilk = (int) userInput.nextInt();

            switch (splashOneMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little 1% milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra 1% milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want 2% Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashTwoMilk = (int) userInput.nextInt();

            switch (splashTwoMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little 2% milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra 2% milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Almond Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashAlmondMilk = (int) userInput.nextInt();

            switch (splashAlmondMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little almond milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra almond milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Coconut Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashCoconutMilk = (int) userInput.nextInt();

            switch (splashCoconutMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little coconut milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra coconut milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Cream (Half & Half)?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashCreamHH = (int) userInput.nextInt();

            switch (splashCreamHH) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little Half & Half\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra Half & Half\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Heavy Cream?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashHeavyCream = (int) userInput.nextInt();

            switch (splashHeavyCream) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little heavy cream\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra heavy cream\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Nonfat Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashNonFatMilk = (int) userInput.nextInt();

            switch (splashNonFatMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little nonfat milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra nonfat milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Oat Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashOatmilk = (int) userInput.nextInt();

            switch (splashOatmilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little oat milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra oat milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Soy Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashSoyMilk = (int) userInput.nextInt();

            switch (splashSoyMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little soy milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra soy milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Whole Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashWholeMilk = (int) userInput.nextInt();

            switch (splashWholeMilk) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little whole milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra whole milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }

            System.out.println("Do you want Sweet Milk?");
            System.out.println("Press 1 for none, 2 for little, 3 for extra");
            splashSweetCream = (int) userInput.nextInt();

            switch (splashSweetCream) {
                case 1:
                    break;
                case 2:
                    customizationReturner += "\tAdd little sweet milk\n";
                    break;
                case 3:
                    customizationReturner += "\tAdd extra sweet milk\n";
                    break;
                default:
                    System.out.println("You entered a number that is not isn't registered");
                    System.out.println("Default will be none");
                    break;
            }
        }catch(Exception e){
            oats();
        }
        return customizationReturner;
    }
}

