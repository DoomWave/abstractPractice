public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Woof!");
    }

    @Override
    void move() {
        System.out.println(name + " runs");
    }

    @Override
    void displayInfo() {
        System.out.println("Dog Info: " + "\n name: " + name + "\n age: " + age);
    }
}
