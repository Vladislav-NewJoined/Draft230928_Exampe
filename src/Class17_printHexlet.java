// источник: https://ru.hexlet.io/qna/java/questions/kak-ispolzovat-metod-iz-drugogo-klassa-java

public class Class17_printHexlet {
    public static void main(String[] args) {
        // Создаем объект класса
        Class17_printHexlet_copy2 greetings = new Class17_printHexlet_copy2();
        // Вызываем метод
        greetings.printHello(); // => Hello
//        Class17_printHexlet_copy2.printHello(); // => Hello
        // Вызываем статический метод
        greetings.printHexlet(); // => Hexlet
        Class17_printHexlet_copy2.printHexlet(); // => Hexlet
    }
}

//class Greetings {
//
//    public void printHello() {
//        System.out.println("Hello");
//    }
//
//    public static void printHexlet() {
//        System.out.println("Hexlet");
//    }
//}
