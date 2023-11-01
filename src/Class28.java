// источник: https://www.youtube.com/watch?v=Muytoo-x-KM

public class Class28 {
}

/*public */class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human();
//        Human human1 = new Human("Bob");
//        Human human1 = new Human("Bob", 40);
//        human1.setName("Bob");
//        human1.setAge(40);
    }
}

class Human {
    private String name;
    private int age;

//    public Human() {
//        System.out.println("Привет из первого конструктора");
//    }

    public Human() {
        this.name = "Имя по умолчанию";
        this.age = 0;
        System.out.println("Привет: Human is: Имя по умолчанию, возраст: 0");
    }

    public Human(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}