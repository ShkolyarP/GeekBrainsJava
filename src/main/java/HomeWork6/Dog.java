package HomeWork6;

public class Dog extends Animal{

    private final int MAX_RUN = 500;
    private final int MAX_SWIM = 10;

    private String name;

    private static int countDog;

    public static int getCountDog() {
        return countDog;
    }

    public static void setCountDog(int countDog) {
        Dog.countDog = countDog;
    }

    public Dog(String name) {

        this.name = name;
        countDog++;
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


    public void swim(int length) {

        if (length<=MAX_SWIM) {
            System.out.println(name + " swim " + length + " m");
        } else {
            System.out.println(name + " swim " + MAX_SWIM + " m");
        }

    }


}
