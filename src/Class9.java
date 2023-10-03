// источник: https://qna.habr.com/q/203245

public class Class9 {

    public static void main(String[] args) {

    }
}



class Apple {
    public String color;
    public String color(){
        /*public */String color = "White";

        return color/*()*/;
    }
}
class Shop {
    public static void main(String[] args){
        Apple a = new Apple();
        System.out.println( a.color() ); // Данный метод должен вывести цвет.
    }
}