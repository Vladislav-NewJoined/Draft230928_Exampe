//источник: https://qaa-engineer.ru/kak-peredat-peremennuyu-iz-odnogo-metoda-v-drugoj-java/
public class Class5 {

    public static void main(String[] args) {
        int counter = getCounter();
        ifCycle(counter);
    }

    public static int getCounter() {
        return 0;
    }

    public static void ifCycle(int counter) {
        for (int i = 0; i < 3; i++) {
            System.out.println("The process continues with counter " + counter);
            counter++;
//            counter = counter + 1;
        }
    }
}
