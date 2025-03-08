// RedheadDuck.java

// This is the RedheadDuck class. It extends the duck class
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        swimBehavior = new Swim();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a Redhead Duck.");
    }
}
