import java.util.HashMap;
import java.util.Collection;

import ecs100.*;
/**
 * description
 * 
 * @author Te Mihinga
 * @version v.1 26/05/25
 */
public class Interface {
    
    //instance variables
    private HashMap<Integer, Card> set;
    private int currCardId;
    private int IMAGE_WIDTH = 188;
    private int IMAGE_HEIGHT = 263;

    public Interface() {
        // initialise Hashmap
        set = new HashMap<Integer, Card>();

        // add cards to hashmap
        Card exeggcute = new Card(1, "Exeggcute", 6.30, "Exeggcute");
        Card mew = new Card(2, "Mew", 8.89, "Mew");
        Card jigglypuff = new Card(3, "Jigglypuff", 11.66, "Jigglypuff");
        Card munna = new Card(4, "Munna", 1.97, "Munna");

        set.put(1, exeggcute);
        set.put(2, mew);
        set.put(3, jigglypuff);
        set.put(4, munna);

        
        this.currCardId = 4;
    }

    public void addCard() {
        // create a new Card from inputted information
        String cardName = UI.askString("Enter Name of Card: ");
        double cardMoney = UI.askDouble("Enter Monetary Vaue of Card: ");
        String cardImage = UI.askString("Enter the file name of your image (Enter N to use default image) : ");
        if (cardImage.equalsIgnoreCase("N")) {
            cardImage = "images/card_default.jpg";
        } else  {
            cardImage = "images/" + cardImage + ".jpg";
        }
        currCardId += 1;
        Card newCard = new Card(currCardId, cardName, cardMoney, cardImage);
        set.put(currCardId, newCard);
        UI.println("Card added");
        newCard.printCard();
        UI.drawImage("C:/Users/mihif/OneDrive/Documents/VSCode/Pokemon/AS 91906 - Advanced Code/src/images/card_default.jpg", 100, 100, IMAGE_WIDTH, IMAGE_HEIGHT);
    }

    public void findCard() {
        String findName = UI.askString("Enter Name of Card: ");
        double findMoney = UI.askDouble("Enter Monetary Vaue of Card: ");
        Collection<Card> collection = set.values();
        for (Card card : collection) {
            if(findName.equalsIgnoreCase(card.getName()) || findMoney == card.getMoney()) {
                card.printCard();
            }
        }
    }

    public void printAll() {
        Collection<Card> collection = set.values();
        for (Card card : collection) {
            card.printCard();
        }
    }
}
