package lesson1;

public class MainClassForLessonOne {
    public static void main(String[] args) {
        System.out.println("Hello, GeekBrains!");
        printHello();
        testVars();
    }

    

    static void printHello(){
        System.out.println("Hello, world!");
    }

    private static void testVars(){
        int varA = 9;
        int varB = 5;
        System.out.println(varA + varB);


    }
}
