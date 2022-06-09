package HomeWork6;

import static HomeWork6.Animal.infoAnimal;

public class Task1 {

    public static void main(String[] args) {
        Cat cat = new Cat("Pushok");

        cat.run(300);

        Dog dog = new Dog("Bobik");

        dog.run(400);
        dog.swim(200);

        infoAnimal();
    }

}
