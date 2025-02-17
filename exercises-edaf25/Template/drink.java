package Template;

public abstract class drink {

    void prepareDrink() {
        System.out.println("Preparing drink!");
    }

    void addExtras() {
        System.out.println("Add extra to drink!");
    }

    abstract void brew();
}
