package HomeWork6;

import static HomeWork6.Cat.getCountCat;
import static HomeWork6.Dog.getCountDog;

public abstract class Animal {

    private static int countAnimal = 0;

    public static int getCountAnimal() {
        return countAnimal;
    }

    public static void setCountAnimal(int countAnimal) {
        Animal.countAnimal = countAnimal;
    }

    public abstract void run(int length);

    public static void infoAnimal(){
        System.out.println("Dogs: " + getCountDog());
        System.out.println("Cats: " + getCountCat());
        System.out.println("Animals: " + getCountAnimal());
    }

}


