import java.io.FileNotFoundException;

public class Driver {


    public static void main(String[] youngShivi) throws FileNotFoundException, InterruptedException {
        Menu main = new Menu();
        System.out.println("Welcome to Starbuck!");
        Thread.sleep(1000);
        main.menu();
    }
}
