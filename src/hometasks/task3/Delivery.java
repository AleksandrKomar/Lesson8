package hometasks.task3;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество клиентов = ");
        int n = input.nextInt();

        System.out.println("Возможных способов доставки - " + delivery(n));

    }

    static int delivery(int a) {

        //Недостаток рекурсии для расчета факториала, что мы не можем уследить за размером переменной
        //если введут большое число и мы в рекурсии выйдем за границы числа int, то будет исключение
        //как варианты использовать больше long

        if (a < 0) {
            return 0;
        } else if (a == 1 || a == 0) {
            return 1;
        } else {
            return a * delivery(a - 1);
        }

    }

}
