public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + ": gluu, gluu");
    }

    @Override
    void move() {
        System.out.println(name + " swims");
    }
    @Override
    void displayInfo() {
        System.out.println("Fish Info: \n name: " + name + "\n age: " + age);
    }
}
