package org.example;

import java.util.Scanner;

public class EInSearchOfAnEasyProblem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int isHard = 0;
            for (int i = 0; i < n; i++) {
                isHard+= scanner.nextInt();
            }
            if(isHard>0)
            System.out.println("HARD");
            else System.out.println("EASY");
        }
}
