package com.company;

public class Main {

    public static void main(String[] args) {
        //������ 1
        System.out.println("Task 1");
        short clientOS = 1;
        if (clientOS == 0 ){
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        }
        else{
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        }

        //������ 2
        System.out.println("Task 2");
        short OS = 0;
        int clientDeviceYear = 2015;
        if (OS == 0 && clientDeviceYear >= 2015){
                System.out.println("���������� ������ ���������� ��� iOS �� ������");
            }
        else if (OS == 0 && clientDeviceYear < 2015) {
                System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
            }
        else if (OS == 1 && clientDeviceYear >= 2015){
                System.out.println("���������� ������ ���������� ��� Android �� ������");
            }
        else {
                System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
            }

        //������ 3
        System.out.println("Task 3");
        int year = 2021;
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0){
            System.out.println(year + " ��� �� �������� ����������");
        }
        else{
            System.out.println(year + " ��� �������� ����������");
        }

        //������ 4
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryDays = 0;
        if (deliveryDistance <= 20){
            deliveryDays = 1;
        }
        else if (deliveryDistance > 20 && deliveryDistance < 60){
            deliveryDays =2;
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100){
            deliveryDays = 3;
        }
        System.out.println("����������� ����: " + deliveryDays);


        //������ 5
        System.out.println("Task 5");
        short monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " ����� ����������� � ������ ����");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " ����� ����������� � ������ �����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " ����� ����������� � ������ ����");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " ����� ����������� � ������ �����");
                break;
            default:
                System.out.println("�������� ������");
        }
    }
}
