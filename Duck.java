// Duck.java

// This is the Duck superclass
public abstract class Duck {
    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {//to fly
        flyBehavior.fly();
    }

    public void performSwim() {//to swim
        swimBehavior.swim();
    }

    public void performQuack() {//to quack
        quackBehavior.quack();
    }

    public abstract void display();//to display
}
