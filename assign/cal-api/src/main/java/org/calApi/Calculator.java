package org.calApi;
import java.util.Scanner;
public class Calculator
{
    public static void addition(){
        int nOne, nTwo;
        Scanner sc = new Scanner(System.in);
        System.out.println("ADDITION");
        System.out.print("\nFirst Number: ");
        nOne = sc.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = sc.nextInt();

        System.out.println("\nPerforming Addition: " + nOne + " + " + nTwo + " = " + (nOne + nTwo));
    }

    public static void subtraction(){
        int nOne, nTwo;
        Scanner sc = new Scanner(System.in);

        System.out.println("SUBTRACTION");

        System.out.print("\nFirst Number: ");
        nOne = sc.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = sc.nextInt();

        System.out.println("\nPerforming  Subtraction: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
    }

    public static void division(){
        int nOne, nTwo;
        Scanner sc = new Scanner(System.in);

        System.out.println("DIVISION");

        System.out.print("\nFirst Number: ");
        nOne = sc.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = sc.nextInt();

        System.out.println("\nPerforming  Division: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));
    }

    public static void multiplication(){
        int nOne, nTwo;
        Scanner sc = new Scanner(System.in);

        System.out.println("MULTIPLICATION");

        System.out.print("\nFirst Number: ");
        nOne = sc.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = sc.nextInt();

        System.out.println("\nPerforming Multiplication: " + nOne + " x " + nTwo + " = " + (nOne * nTwo));
    }

}