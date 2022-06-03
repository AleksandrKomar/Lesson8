package hometasks.task2;

import java.util.Scanner;

public class Bank {

    static boolean nePogashen = true;
    static int credit = 700;
    static int debt = 0; //долг
    static int overpayment = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Введите сумму погашения кредита = ");

            int a = input.nextInt();

            payment(a);

        } while (nePogashen);

    }

    public static void payment(int money) {

        if (money > credit) {
            overpayment = money - credit;
            System.out.println("Переплата по кредиту составила " + overpayment + " грн");
            System.out.println("Кредит погашен");
            nePogashen = false;

        } else if (money == credit) {
            credit -= money;
            System.out.println("Кредит погашен");
            nePogashen = false;
        } else {

            debt = credit - money;
            credit -= money;
            System.out.println("Задолженность по кредиту составляет " + debt + " грн");
        }
    }

}
