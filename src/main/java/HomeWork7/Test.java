package HomeWork7;

public class Test {
    public static void main(String[] args) {

        Plate plate = new Plate(85);

        plate.printInfo();

        System.out.println();

        Cat[] cats = new Cat[10];
        cats[0] = new Cat("Rick");
        cats[1] = new Cat("Bob");
        cats[2] = new Cat("Zara");
        cats[3] = new Cat("Sam");
        cats[4] = new Cat("Inga");
        cats[5] = new Cat("Lala");
        cats[6] = new Cat("Leo");
        cats[7] = new Cat("Tom");
        cats[8] = new Cat("Ugo");
        cats[9] = new Cat("Mara");

        for (Cat cat:
                cats) {
            cat.eat(plate);
        }

        System.out.println();
        plate.printInfo();

        for (Cat cat:
                cats) {
            cat.catInfo();
        }
    }
}