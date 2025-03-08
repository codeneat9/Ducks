// Duck.java

// This is the Duck superclass
public abstract class Duck {
    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {//to fly
        flyBehavior.fly();
    }
