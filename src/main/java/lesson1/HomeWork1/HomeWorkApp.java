package lesson1.HomeWork1; //

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = -47;
        int b = 83;
        if ((a + b) >= 0) {
            System.out.println("����� �������������");
        } else System.out.println("����� �������������");
    }

    private static void printColor() {
        int value = 11;
        if (value <= 0) {
            System.out.println("�������");
        } else if (value > 0 && value <= 100) {
            System.out.println("������");
        } else System.out.println("�������");
    }

    private static void compareNumbers() {
        int a = 43;
        int b = 96;
        if (a >= b) {
            System.out.println("a>=b");
        } else System.out.println("a<b");
    }
}
