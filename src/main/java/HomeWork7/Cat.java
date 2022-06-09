package HomeWork7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private String name;
    private boolean satiety = false;

    public Cat(String name) {

        this.name = name;
    }

   
    public void eat(Plate plate) {
        Random rd = new Random();
        while (!satiety) {
            if (plate.getFoodCount() == 0){
                break;
            }
            int catEatFoodCount = ThreadLocalRandom.current().nextInt(4) + 3;
            if (catEatFoodCount > plate.getFoodCount()){
                catEatFoodCount = plate.getFoodCount();
            }
            plate.decreaseFood(catEatFoodCount);
            System.out.println("Cat " + name + " ate " + catEatFoodCount + " food");
            satiety = rd.nextBoolean();
            if (satiety){
                System.out.println("Cat " + name + " is full");
            }
        }
    }

    public void catInfo(){
        if (this.satiety){
            System.out.println("Cat " + name + " is full");
        } else {
            System.out.println("Cat " + name + " is hungry");
        }


    }
}
