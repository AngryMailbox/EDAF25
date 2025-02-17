package Template;

public class hotDrink extends drink {
    void prepareDrink() {
        System.out.println("Preparing hot drink!");
    }

    void addExtras() {
        System.out.println("Add extra to hot drink!");
    }

    @Override
    void brew() {
        System.out.println("Brewing hot drink");
    }
}