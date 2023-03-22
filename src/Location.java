import java.util.*;
import java.io.*;

// This is supposed to ask the user where they want to pick their order up
public class Location {

    public static String locationName = null;
    static Scanner userInput = new Scanner(System.in);

    public static String findLocation() throws FileNotFoundException {
        File locations = new File("Store Locations.txt");
        Scanner findLocationScan = new Scanner(locations);
        while (findLocationScan.hasNextLine()) {
            System.out.println(findLocationScan.nextLine());
        }
        findLocationScan.close();

        System.out.println("Please enter the number of your location.");
        try {
            int locationNumber;
            locationNumber = userInput.nextInt();

            switch (locationNumber) {
                case 1:
                    locationName = "Mountlake Terrace, Washington";
                    break;
                case 2:
                    locationName = "Mill Creek, Washington";
                    break;
                case 3:
                    locationName = "Lynnwood, Washington";
                    break;
                case 4:
                    locationName = "Edmonds, Washington";
                    break;
                case 5:
                    locationName = "Roselle, Berengaria";
                    break;
                case 6:
                    locationName = "Bothell, Washington";
                    break;
                case 7:
                    locationName = "University of Washington, Bothell";
                    break;
                case 8:
                    locationName = "University of Washington, Seattle";
                    break;
                default:
                    System.out.println("The number you entered doesn't match our database");
                    findLocation();
            }
        } catch (Exception e) {
            System.out.println("The number you entered isn't a possible value");
            findLocation();
        }
        return locationName;
    }

}
