package HomeWork4;

public class Validity {

    public static int getValidNumberFromScanner() {
        while (true) {
            if (GamePlay.getIn().hasNextInt()) {
                int n = GamePlay.getIn().nextInt();
                if (isNumberValid(n)) {
                    return n;
                }
                System.out.println("Проверьте значение координаты! Должно быть от 1 до " + GameMap.getSize());

            } else {
                System.out.println("!!!Ввод допускает лишь целые числа!!!");
                GamePlay.getIn().next();
            }
        }
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= GameMap.getSize();
    }

}
