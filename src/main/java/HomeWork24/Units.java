package HomeWork24;

public class Units {

    @BeforeSuite
    private static void test1() {
        System.out.println(1);
    }

    @Test(priority = 1)
    private static void test2() {
        System.out.println(2);
    }

    @Test(priority = 2)
    private static void test3() {
        System.out.println(3);
    }

    @Test(priority = 3)
    private static void test4() {
        System.out.println(4);
    }

    @Test(priority = 4)
    private static void test5() {
        System.out.println(5);
    }

    private static void test6() {
        System.out.println(6);
    }

    @Test
    private static void test7() {
        System.out.println(7);
    }


    @AfterSuite
    private static void test8() {
        System.out.println(8);
    }
}
