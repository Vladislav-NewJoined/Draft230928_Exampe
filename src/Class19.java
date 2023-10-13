// источник: https://www.bestprog.net/ru/2018/08/09/methods-passing-parameters-into-methods-functions-of-the-class-passing-of-variables-of-primitive-data-types-and-objects-into-a-method-as-a-parameter_ru/

public class Class19 {
    public static void main(String[] args) {

        int t, x, y;
        x = 133;
        y = 67;
        t = Max(x, y); // t = 133
        System.out.println("Max = " + t);
    }



    static int Max(int a, int b) {
        if (a > b) return a;
        else return b;
    }
}


