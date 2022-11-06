package com.bridgelabz;

import java.util.Scanner;

public class WindChil {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of T (Air Temp) :");
        double t = sc.nextInt();
        System.out.println("Enter a Value of V (Wind speed) :");
        double v = sc.nextInt();

        double windChillTemp = 35.74 + 0.6215 * t +
                (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println(windChillTemp);
    }
}
