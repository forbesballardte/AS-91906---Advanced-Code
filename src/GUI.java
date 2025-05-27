import ecs100.*;

public class GUI {

    //.instence variables
    private Interface set;
    private Card card;

    public GUI() {

        set = new Interface();

        // intislaes GUI and buttons.
        UI.initialise();
        UI.setMouseListener(null);
        UI.addButton("Add Card", set::addCard);
        UI.addButton("Find Card", set::findCard);
        UI.addButton("Print All Cards", set::printAll);
        UI.addButton("Hide Cards", null);
        UI.addButton("Quit", UI::quit);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
