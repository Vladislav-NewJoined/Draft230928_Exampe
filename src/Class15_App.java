class Class15_App {
    public static void main(String[] args) {
        System.out.println("Hello BeTry");

        Class15_Cat barsik = new Class15_Cat();
        barsik.name = "Barsik";
        barsik.age = 3;
        System.out.println(barsik.name);
        barsik.sleep();
        System.out.println(barsik.toString());

        Class15_Cat tom = new Class15_Cat("Tom", 1);
        System.out.println(tom.toString());

    }
}