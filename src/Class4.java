//источник: https://qaa-engineer.ru/kak-peredat-peremennuyu-iz-odnogo-metoda-v-drugoj-java/
public class Class4 {

    public static void main(String[] args) {
        int counter = 0;
        ifCycle(counter);

    }

    public static void ifCycle(int counter) {
        for (int i = 0; i < 3; i++) {
            System.out.println("The process continues with counter = " + counter);
            counter++;
        }
    }
}
