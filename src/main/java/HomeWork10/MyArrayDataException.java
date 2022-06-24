package HomeWork10;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int i, int j) {
        System.out.println("ошибка данных в €чейке " + "[" + i + "]" + "[" + j + "]");
    }
}
