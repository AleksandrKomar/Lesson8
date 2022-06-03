package hometasks.task2;

import java.util.Scanner;

public class Bank {

    static boolean nePogashen = true;
    static int credit = 700;
    static int debt = 0; //����
    static int overpayment = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("������� ����� ��������� ������� = ");

            int a = input.nextInt();

            payment(a);

        } while (nePogashen);

    }

    public static void payment(int money) {

        if (money > credit) {
            overpayment = money - credit;
            System.out.println("��������� �� ������� ��������� " + overpayment + " ���");
            System.out.println("������ �������");
            nePogashen = false;

        } else if (money == credit) {
            credit -= money;
            System.out.println("������ �������");
            nePogashen = false;
        } else {

            debt = credit - money;
            credit -= money;
            System.out.println("������������� �� ������� ���������� " + debt + " ���");
        }
    }

}
