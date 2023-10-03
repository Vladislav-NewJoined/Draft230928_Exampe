//источник: https://qaa-engineer.ru/kak-peredat-peremennuyu-iz-odnogo-metoda-v-drugoj-java/
public class Class7 {

    int number = 0;

    public static void main(String[] args) {
        int number = 5;
        b(number);
    }

    public static void b(int number) {
//        System.out.println(number);
        for (int i = 0; i < 3; i++) {
            System.out.println("The process continues with counter " + number);
            number++;
//            counter = counter + 1;

        }
    }
}