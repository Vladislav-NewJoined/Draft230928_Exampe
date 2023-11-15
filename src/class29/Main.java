package class29;

public class Main {
    public static void main(String[] args) {
        Person vitya = new Person(120, "Vitya");
//        vitya.height = 120;
        vitya.say("George");
        System.out.println(vitya.name + "\'s height is " + vitya.height);
        Person vlad = new Person();
        System.out.println(vlad.height);

        Person dima = new Person("Dima");
        System.out.println(dima.name);

    }
}
