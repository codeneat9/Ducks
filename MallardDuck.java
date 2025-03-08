// MallardDuck.java
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        swimBehavior = new Swim();
        quackBehavior = new Quack();
    }
