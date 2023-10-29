// источник: https://youtu.be/YuhItH5wwvE delat
// +java вызов методов и переменных из другого класса примеры
// источник: https://www.cyberforum.ru/java-j2se/thread1981757.html
// источник: https://deveducation.com/blog/kak-vyzyvat-i-ispolzovat-metody-java/


public class Class24 {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name);
//        System.out.println(speak(name));
    }


    public static void speak(StringBuilder s) {
        s.append("Матвей внутри");
    }










//    public static void main(String[] args) {
//        String name = "Матвей";
//        name = speak(name);
//        System.out.println(name);
//        System.out.println(speak(name));
//    }
//
//
//    public static String speak(String name) {
////        System.out.println(name);
////        return name = "Марат";
//        return name = name + 1;
//    }







//    public static void main(String args[]) {
//        int num = 4;
////        newNumber(5);
//        num = newNumber(23);
//        num = newNumber(num);
//        System.out.println(num);
//        System.out.println(newNumber(5));
//    }
//
//    public static int  newNumber (int num) {
//        return num = 8;
//    }
}