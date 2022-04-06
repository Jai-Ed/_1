package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);
        int number = -1; int blocks = number;

        while (number < 1 || number > 8)
        {
            System.out.println("Choose number between 1-8");
            number = keyboard.nextInt();

        } System.out.println("done");

        for (int i = 1; i <= blocks; ++i) {
            for (int m = i; m<= i; ++ m); {
                System.out.println("#");{
                    System.out.println();
                }
            }


        }

    }
}
