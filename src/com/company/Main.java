package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        work();
    }

    public static void work() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите основание системы :");
        NumericalSystem baseOfSystem = new NumericalSystem(scanner.nextInt());

        int option = 0;
        while (option != 4) {
            System.out.println("Выберите команду\n" +
                    "1.Перевести число в это основание системы\n" +
                    "2.Перевести в десятеричную систему\n" +
                    "3.Изменить систему\n" +
                    "4.Завершить программу");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.print("Введите число :");
                    printTheBaseSystem(baseOfSystem, scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Введите число :");
                    scanner.nextLine();
                    printTheValueInTheDecimalSystem(baseOfSystem, scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Введите новое основание :");
                    baseOfSystem = new NumericalSystem(scanner.nextInt());
                    break;
            }
            System.out.println();
        }
    }

    public static void printTheBaseSystem(NumericalSystem baseOfSystem, int num) {
        System.out.println("Число в выбранной системе исчисления: " + baseOfSystem.convertToBaseSystem(num));
    }

    public static void printTheValueInTheDecimalSystem(NumericalSystem baseOfSystem, String num) {
        System.out.println("Число в десятиричной системе : " + baseOfSystem.convertToDecimal(num));
    }
}