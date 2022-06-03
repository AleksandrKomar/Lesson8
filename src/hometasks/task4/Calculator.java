package hometasks.task4;

public class Calculator {

    public static void main(String[] args) {

        int a = 3, b = 7, c = 11;

        calculate(a, b, c);
    }

    static void calculate(int a, int b, int c) {
        System.out.printf(a + " / " + 5 + " = %.2f\n", (double) a / 5);
        System.out.printf(b + " / " + 5 + " = %.2f\n", (double) b / 5);
        System.out.printf(c + " / " + 5 + " = %.2f\n", (double) c / 5);
    }
}
