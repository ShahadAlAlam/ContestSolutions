package org.example;


import java.util.Scanner;

public class CFoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int indicator = 0;

        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    System.out.print("#");
                }
            } else {
                if(indicator==0) {
                    for (int j = 0; j < c - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                    indicator = 1;
                } else {
                    System.out.print("#");
                    for (int j = 0; j < c - 1; j++) {
                        System.out.print(".");
                    }
                    indicator = 0;
                }

            }
            System.out.println();
        }
    }
}


