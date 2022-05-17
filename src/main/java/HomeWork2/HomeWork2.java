package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {

    }

    private static boolean checkingTheSum(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    private static void determineTheSign(int a) {
        if (a >= 0) System.out.println("Positive number");
        else System.out.println("Negative number");
    }

    private static boolean determineTheSignTF(int a) {
        return (a >= 0);
    }

    private static void printingString(String string, int amount) {
        if (amount <= 0)
            System.out.println("Error! Number must be positive!");
        else for (int i = 1; i <= amount; i++)
            System.out.println(string);
    }

    private static boolean determineLeapYear(int year) {
        boolean leapYear = true;
        if (year % 4 != 0) leapYear = false;
        else if (year % 400 == 0) leapYear = true;
        else if (year % 100 == 0) leapYear = false;
        return leapYear;
    }


}

