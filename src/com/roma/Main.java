package com.roma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первое число");
	    Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        System.out.println("Введите второе число");
        scanner = new Scanner(System.in);
        double y = scanner.nextInt();
        System.out.println("Введите третье число");
        scanner = new Scanner(System.in);
        double z = scanner.nextInt();
        double CA = (x + y + z)/3;
        System.out.println("Среднее арифметическое = " + CA);
        double result = CA/2;
        //System.out.println("Ср. арифм., / на 2 и округ. в меньш. сторону = " + Math. floor(result));
        Math. floor(result);
            if(Math. floor(result) > 3) {
                System.out.println("Программа выполнена корректно");
            }


    }
}
