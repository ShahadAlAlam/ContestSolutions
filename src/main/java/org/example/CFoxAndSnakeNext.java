package org.example;


import java.util.Scanner;

public class CFoxAndSnakeNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int indicator = 0;

        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                String a = "#";
                a = a.repeat(c);
                System.out.println(a);
            } else {
                if(indicator==0) {
                    String a = ".";
                    a = a.repeat(c-1);
                    System.out.println(a);
                    System.out.print("#");
                    indicator = 1;
                } else {
                    System.out.print("#");
                    String a = "#";
                    a = a.repeat(c-1);
                    System.out.println(a);
                    indicator = 0;
                }

            }
            System.out.println();
        }
    }
}


