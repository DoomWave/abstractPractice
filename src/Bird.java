public class Bird extends Animal {
    public Bird(String name, int age){
        super(name, age);
    }

    @Override
    void makeSound (){
        System.out.println(name + ": Tweet!");
    }

    @Override
    void move(){
        System.out.println(name + " flies");
    }
    @Override
    void displayInfo(){
        System.out.println("Bird Info: \n name: " + name + "\n age: " + age);
    }
}
