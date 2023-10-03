public class Class8 {

    public static int maxFinder(int a, int b) { //заголовок метода

        //ниже — тело метода
        int max;
        if (a < b)
            max = b;
        else
            max = a;
//        System.out.println(max);

        return max;
    }

    public static void main(String[] args) {
        System.out.print(maxFinder(3,7));
    }

}