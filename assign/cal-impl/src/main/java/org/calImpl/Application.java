package org.calImpl;
import org.calApi.Calculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*******CALCULATOR*******");

        System.out.println("\nOPTIONS:");
        System.out.println("\n1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. DIVISION");
        System.out.println("4. MULTIPLICATION");

        System.out.println("\nCHOOSE FROM OPTIONS:");
        int choice = sc.nextInt();
        System.out.println();

        Calculator calobject=new Calculator();

        if (choice == 1){
            calobject.addition();
        }
        else if (choice == 2){
            calobject.subtraction();
        }
        else if (choice == 3){
            calobject.division();
        }
        else if (choice == 4){
            calobject.multiplication();
        }

        System.out.println();

    }

}
