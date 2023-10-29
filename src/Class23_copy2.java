//источник: https://qaa-engineer.ru/kak-peredat-peremennuyu-iz-odnogo-metoda-v-drugoj-java/
public class Class23_copy2 {

    public static void b(int number) {
        for (int i = 0; i < 3; i++) {
            System.out.println("The process continues with counter " + number);
            number++;
//            counter = counter + 1;

        }
    }
}