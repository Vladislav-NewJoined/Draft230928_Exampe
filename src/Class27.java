// источник: https://javarush.com/groups/posts/1391-konstruktorih-klassov-java-jdk-15

public class Class27 {
}

class DefaultDemo {
    DefaultDemo(String s) {
        System.out.print("DefaultDemo(String)");
    }

    /*
    DefaultDemo(int ... v)
    {
     System.out.println("DefaultDemo(int ...)");
    }
    */
    public static void main(String[] args) {
//        DefaultDemo dd = new DefaultDemo();
    }
}