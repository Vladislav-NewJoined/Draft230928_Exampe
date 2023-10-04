//источник: https://qaa-engineer.ru/kak-peredat-peremennuyu-iz-odnogo-metoda-v-drugoj-java/
public class Class11 {

    private static Object ifCycle;

    public static void main(String[] args) {
        int counter = 0;
        ifCycle(counter);
//        ifCycle.counter;
//        System.out.println("The process continues with counter " + ifCycle(counter));
    }

    public static int ifCycle(int counter) {
        for (int i = 0; i < 3; i++) {
            System.out.println("The process continues with counter " + counter);
            counter++;
//            counter = counter + 1;
        }
        return counter;
    }
}
