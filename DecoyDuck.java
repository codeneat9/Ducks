// DecoyDuck.java
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        swimBehavior = new Drown();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I am a Decoy Duck.");
    }
}
