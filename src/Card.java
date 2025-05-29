/*
 * Creating the object Card
 * 
 * @author Te Mihinga
 * @version v.1     26/05/25
 */

import ecs100.UI;

public class Card {

    // instance Variables
    private int id;
    private String name;
    private double money;
    private String IMAGE;
    private int IMAGE_WIDTH = 333;
    private int IMAGE_HEIGHT = 467;
    private String FILE_PATH = "C:/Users/mihif/OneDrive/Documents/VSCode/Pokemon/AS 91906 - Advanced Code/src/images/";

    // Constructor
    public Card(int id, String name, double money, String IMAGE) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.IMAGE = IMAGE;
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public String getImage() {
        return this.IMAGE;
    }

    public void printCard() 
    {
        UI.printf("\nName: %s\nMonatery Value: $%4.2f\n", name, money);
    }

    public void displayCard() {
        UI.drawImage(FILE_PATH + IMAGE + ".jpg", 75, 75, IMAGE_WIDTH, IMAGE_HEIGHT);
    }
}

