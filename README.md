# **Ducks Simulation (Strategy Pattern in Java)**  

This Java program demonstrates the **Strategy Design Pattern**, where different types of ducks exhibit unique behaviors in terms of **flying, swimming, and quacking**.  
It follows the use of **abstract classes and interfaces** for modular and scalable code.  

---

## **Features**  
- Implements the **Strategy Pattern** for dynamic behavior changes.  
- Uses **Abstract Class (Duck)** for common properties.  
- Implements **Interfaces (FlyBehavior, SwimBehavior, QuackBehavior)** for flexible behavior assignment.  
- Supports **multiple duck types with separate Java files**.  
- Demonstrates **polymorphism** and **code reusability**.  

---

## **Class Overview**  

### **Duck**  
- Abstract class.  
- Contains performFly(), performSwim(), and performQuack() methods.  

### **FlyBehavior**  
- Interface for different flying behaviors.  
- Methods: void fly().  

### **SwimBehavior**  
- Interface for different swimming behaviors.  
- Methods: void swim().  

### **QuackBehavior**  
- Interface for different quacking behaviors.  
- Methods: void quack().  

---

## **Duck Implementations**  

### **MallardDuck**  
- Extends Duck.  
- Behaviors: **FlyWithWings, Swim, Quack**.  

### **RedheadDuck**  
- Extends Duck.  
- Behaviors: **FlyWithWings, Swim, Quack**.  

### **RubberDuck**  
- Extends Duck.  
- Behaviors: **FlyNoWay, FloatSwim, Squeak**.  

### **DecoyDuck**  
- Extends Duck.  
- Behaviors: **FlyNoWay, Drown, MuteQuack**.  

---

## **Class & Method Details**  

### **Duck.java (Abstract Class)**  
- void performFly() 
- void performSwim()  
- void performQuack() 
- Constructor: Duck()  

### **FlyBehavior.java (Interface)**  
- void fly()

### **SwimBehavior.java (Interface)**  
- void swim() 

### **QuackBehavior.java (Interface)**  
- void quack()

### **FlyWithWings.java (Implements FlyBehavior)**  
- void fly() → "I believe I can fly."

### **FlyNoWay.java (Implements FlyBehavior)**  
- void fly() → "I cannot fly :( "  

### **Swim.java (Implements SwimBehavior)**  
- void swim() → "I can swim."  

### **FloatSwim.java (Implements SwimBehavior)**  
- void swim() → "I can only float :("  

### **Drown.java (Implements SwimBehavior)**  
- void swim() → "Oh! I'm drowning!"  

### **`Quack.java (Implements QuackBehavior)**  
- void quack() → "Quack! Quack!"  

### **Squeak.java (Implements QuackBehavior)**  
- void quack() → "Squeak! Squeak!"  

### **MuteQuack.java (Implements QuackBehavior)**  
- void quack() → "I'm Mute"  

### **Main.java (Program Entry)**  
- **Menu System**: Displays the behavior of each duck type.  
- Calls performFly(), performSwim(), performQuack(), and display().  

---

## **How to Run the Program**  

### 1. Clone the Repository
git clone https://github.com/codeneat9/Ducks.git  
cd Ducks
### 2. Compile using javac the run the Main.java


## Expected Output
<img width="199" alt="image" src="https://github.com/user-attachments/assets/377e7291-4b78-4819-806a-76e11d13dd3d" />

## Author
#### Yashwith Behara
