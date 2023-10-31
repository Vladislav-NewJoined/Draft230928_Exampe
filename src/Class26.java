// источник: https://deveducation.com/blog/kak-vyzyvat-i-ispolzovat-metody-java/

public class Class26 {
    public static int maxFinder(int a, int b) { //заголовок метода
//ниже — тело метода
        int max;
        if (a < b)
            max = b;
        else
            max = a;
        return max;


//        int max = Math.max(a, b);
//        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxFinder(4, 9));
    }
}

class Cat {
    void meow() {
        // параметры отсутствуют
    }

    void meow(int count) {
        // используется один параметр типа int
    }

    void meow(int count, int pause) {
        // используются два параметра типа int
    }

    long meow(long time) {
        // используется один параметр типа long
        return time;
    }

    double meow(double time) {
        // используется один параметр типа double
        return time;
    }
}

class Cat2 {
    public static void main(String[] args) {

        Cat kitty = new Cat();
        kitty.meow();
        kitty.meow(3);
        kitty.meow(3,2);
        kitty.meow(4500.25);
    }
}

class MaxFinder {
    public static void main(String[] args) {
        Class26 mf = new Class26();
        mf.maxFinder(5, 9);
        Class26.maxFinder(51, 91);
        System.out.println(mf.maxFinder(17, 3));
        System.out.println(Class26.maxFinder(5, 10));

    }
}