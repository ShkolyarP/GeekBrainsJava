package HomeWork10;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int i, int j) {
        System.out.println("������ ������ � ������ " + "[" + i + "]" + "[" + j + "]");
    }
}
