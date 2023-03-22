import java.util.Scanner;

public class UpdateBasket {

   

    public static String[] addToBasket(String[] basket) {
       String[] moreWords = new String[basket.length+1];

        for (int i = 0; i < basket.length; i++) {
            moreWords[i] = basket[i];
        }
        Menu customizationsStringTranslate = new Menu();
        moreWords[moreWords.length-1] = customizationsStringTranslate.customizations;

        return moreWords;
    }
}
