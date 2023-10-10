public class Class3 {

    public static void main(String[] args) {
        int counter = 0;
        ifCycle(counter);
   }

    public static void ifCycle (int counter) {
        if (counter < 3) {
            System.out.println("The process continues with counter " + counter);
//            counter++;
            counter = counter + 1;
//            counter += counter;
        }
    }
}
