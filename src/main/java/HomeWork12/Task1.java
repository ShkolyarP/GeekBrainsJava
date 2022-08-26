package HomeWork12;

public class Task1 {

    static final int SIZE = 10000000;
    static final int H = SIZE / 2;

    public static void main(String[] args) {


        fillArray();
        fillArrayInHalf();

    }

    private static void fillArray() {

        float[] arr = new float[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);

        System.out.println(arr[456575]);
        System.out.println(arr[H]);
        System.out.println(arr[H - 1]);
        System.out.println(arr[9890893]);
    }

    private static void fillArrayInHalf() {

        float[] arr = new float[SIZE];
        float[] arr1 = new float[H];
        float[] arr2 = new float[H];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        System.arraycopy(arr, 0, arr1, 0, H);
        System.arraycopy(arr, H, arr2, 0, H);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < H; i++) {
                arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
        );

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < H; i++) {
                arr2[i] = (float) (arr2[i] * Math.sin(0.2f + (H + i) / 5) * Math.cos(0.2f + (H + i) / 5) * Math.cos(0.4f + (H + i) / 2));
            }
        }
        );

        long a = System.currentTimeMillis();

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.arraycopy(arr1, 0, arr, 0, H);
        System.arraycopy(arr2, 0, arr, H, H);


        System.out.println(System.currentTimeMillis() - a);

        System.out.println(arr[456575]);
        System.out.println(arr[H]);
        System.out.println(arr[H - 1]);
        System.out.println(arr[9890893]);


    }


}
