// источник: https://metanit.com/java/tutorial/2.16.php?ysclid=ll8j2nh1vz285380969

import static java.lang.Long.sum;

public class Class16 {
    public static void main(String[] args) {

        Class16_copy2 sumFromAnotherClass = new Class16_copy2();
        int a = 6;
        int b = 8;
        sumFromAnotherClass.sum(a, b); // 14
        sumFromAnotherClass.sum(3, a); // 9
        sum(5, 23); // 28
    }

//    static void sum(int x, int y) {
//        int z = x + y;
//        System.out.println(z);
//
//    }
}

//class Class16_copy2 {
//    static void sum(int x, int y) {
//        int z = x + y;
//        System.out.println(z);
//
//    }
//}
