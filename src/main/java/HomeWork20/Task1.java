package HomeWork20;

public class Task1 {

    private int k;

    public static void main(String[] args) {

        Task1 task1 = new Task1();

        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                task1.printingA();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                task1.printingB();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                task1.printingC();
            }
        }).start();


    }

    private synchronized void printingA() {

        System.out.print("A");
        k++;
        try {
            if (k == 1 || k == 4) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private synchronized void printingB() {

        System.out.print("B");
        k++;
        try {
            if (k == 2 || k == 5) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notify();
    }

    private synchronized void printingC() {
        notifyAll();
        System.out.print("C");
        k++;
        try {
            if (k == 3 || k == 6) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
