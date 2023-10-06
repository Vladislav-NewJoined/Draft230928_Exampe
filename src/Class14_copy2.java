import java.util.Scanner;

public class Class14_copy2 {
    public static void main(String[] args) {
        int a = module(parseValue(getFromInput()));
        return;
//        System.out.println("*********************");
    }

    private static int module(int number) {
        return Math.abs(number);
    }

    private static int parseValue(String stringValue) {
        return Integer.parseInt(stringValue);
    }

    private static String getFromInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
