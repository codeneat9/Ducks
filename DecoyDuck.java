// DecoyDuck.java
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        swimBehavior = new Drown();
        quackBehavior = new MuteQuack();
    }
