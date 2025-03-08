// Main.java
// Yashwith Behara
// 23070126151
// AIML B3

// Initializing the Main class
public class Main {
    // Main method
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();
        // Displaying the behavior of each duck
        displayDuckBehavior(mallard);
        displayDuckBehavior(redhead);
        displayDuckBehavior(rubber);
        displayDuckBehavior(decoy);
    }
    // Displaying the behavior of each duck
    private static void displayDuckBehavior(Duck duck) {
        System.out.println("\n" + duck.getClass().getSimpleName() + " behavior:");
        duck.performFly();
        duck.performSwim();
        duck.performQuack();
        duck.display();
    }
}


