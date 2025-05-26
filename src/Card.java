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
        UI.printf("\nName: %s\nAuthor: %f", name, money);
    }
}

