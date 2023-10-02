public class Class2 {

    int counter = 0;

    public static void main(String[] args) {
    }

    public static int count(int counter) {
        counter = 0;
        if (count(counter) < 3) {
            System.out.println("The process continues");
            counter = count(counter) + 1;
//            count(counter)++;
        }
        return counter;
    }

    public void actionPerformed(int counter) {
//        if (count(counter) < 3) {
//            System.out.println("The process continues");
//            counter = count(counter) + 1;
////            count(counter)++;
//        }
    }
}
