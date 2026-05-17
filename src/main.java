public class main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Billy", 8);
        myDog.makeSound();
        myDog.move();
        myDog.displayInfo();

        Bird myBird = new Bird("Wesley", 10);
        myBird.makeSound();
        myBird.move();
        myBird.displayInfo();

        Fish myFish = new Fish("Bob", 2);
        myFish.makeSound();
        myFish.move();
        myFish.displayInfo();
        Animal[] animals = {
                new Dog("Billy", 10),
                new Bird("Wesley",  5),
                new Fish("Bob", 1)
        };
        for(Animal animal: animals){
            animal.makeSound();
            animal.move();
            animal.displayInfo();
            System.out.println();
        }
    }
}
