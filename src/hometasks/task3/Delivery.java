package hometasks.task3;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("������� ���������� �������� = ");
        int n = input.nextInt();

        System.out.println("��������� �������� �������� - " + delivery(n));

    }

    static int delivery(int a) {

        //���������� �������� ��� ������� ����������, ��� �� �� ����� �������� �� �������� ����������
        //���� ������ ������� ����� � �� � �������� ������ �� ������� ����� int, �� ����� ����������
        //��� �������� ������������ ������ long

        if (a < 0) {
            return 0;
        } else if (a == 1 || a == 0) {
            return 1;
        } else {
            return a * delivery(a - 1);
        }

    }

}
