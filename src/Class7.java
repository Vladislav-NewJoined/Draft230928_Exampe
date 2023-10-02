//источник: https://qaa-engineer.ru/kak-peredat-peremennuyu-iz-odnogo-metoda-v-drugoj-java/
public class Class7 {



    int number = 0;

    private void a() {
        number = 5;
    }

    private void b() {
        System.out.println(number);
        for (int i = 0; i < 3; i++) {
            System.out.println("The process continues with counter " + number);
            number++;
//            counter = counter + 1;

        }
    }
}