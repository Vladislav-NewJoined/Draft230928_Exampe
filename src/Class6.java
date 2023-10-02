//источник: https://qaa-engineer.ru/kak-peredat-peremennuyu-iz-odnogo-metoda-v-drugoj-java/
public class Class6 {
    public static int counter;

    public static void main(String[] args) {
        counter = 0;
        ifCycle();
    }

//    public static int getCounter() {
//
//        return 0;
//    }

    public static void ifCycle() {
        for (int i = 0; i < 3; i++) {
            System.out.println("The process continues with counter " + counter);
            counter++;
//            counter = counter + 1;
        }
    }
}
