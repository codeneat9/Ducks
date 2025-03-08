// RubberDuck.java

// This is the RubberDuck class. It extends the Duck class.
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        swimBehavior = new FloatSwim();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I am a Rubber Duck.");
    }
}
