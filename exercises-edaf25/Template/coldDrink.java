package Template;

public class coldDrink extends drink {
    void prepareDrink() {
        System.out.println("Preparing cold drink");
    }

    void addExtras() {
        System.out.println("Adding extras to cold drink");
    }

    @Override
    void brew() {
        System.out.println("Preparing coldDrink");
    }
}
