package HomeWork4;

public class Validity {

    public static int getValidNumberFromScanner() {
        while (true) {
            if (GamePlay.getIn().hasNextInt()) {
                int n = GamePlay.getIn().nextInt();
                if (isNumberValid(n)) {
                    return n;
                }
                System.out.println("��������� �������� ����������! ������ ���� �� 1 �� " + GameMap.getSize());

            } else {
                System.out.println("!!!���� ��������� ���� ����� �����!!!");
                GamePlay.getIn().next();
            }
        }
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= GameMap.getSize();
    }

}
