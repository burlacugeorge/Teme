package org.example.TemaDin11Octombrie;

import java.util.Scanner;

public class FebruaryDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un an între 1900 și 2016: ");
        int year = scanner.nextInt();


        if (year < 1900 || year > 2016) {
            System.out.println("Anul trebuie să fie între 1900 și 2016.");
        } else {
            int days;


            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }

            System.out.println("Numărul de zile din luna februarie în anul " + year + " este: " + days);
        }

        scanner.close();
    }
}
