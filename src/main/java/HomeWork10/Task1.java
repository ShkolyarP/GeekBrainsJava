package HomeWork10;

public class Task1 {
    public static void main(String[] args) {

        String[][] array = {{"3", "70", "7", "20"}, {"3", "5", "g", "20"}, {"3", "70", "a", "20"}, {"3", "70", "7", "20"}};

        System.out.println("Сумма элементов массива равна " + sumStringArray4x4(array));

    }

    public static int sumStringArray4x4(String[][] strings) {

        try {
            if (strings.length != 4 || strings[0].length != 4 || strings[1].length != 4 || strings[2].length != 4 || strings[3].length != 4) {
                throw new MyArraySizeException("Неверный размер массива");
            }
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("Размер массива должен быть [4][4]");

        }

        int sumArray = 0;
        int element;

        for (int i = 0; i < strings.length; i++) {

            for (int j = 0; j < strings.length; j++) {

                try {
                    element = Integer.parseInt(strings[i][j]);
                    sumArray += element;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sumArray;
    }
}


