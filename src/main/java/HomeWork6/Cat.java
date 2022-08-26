package HomeWork6;

public class Cat extends Animal{

    private final int MAX_RUN = 200;

    private String name;

    private static int countCat;

    public static int getCountCat() {
        return countCat;
    }

    public static void setCountCat(int countCat) {
        Cat.countCat = countCat;
    }

    public Cat(String name) {

        this.name = name;
        countCat++;
        setCountAnimal(getCountAnimal() + 1);
    }


    @Override
    public void run(int length) {
        if (length<=MAX_RUN) {
            System.out.println(name + " run " + length + " m");
        } else {
            System.out.println(name + " run " + MAX_RUN + " m");
        }

    }


}
