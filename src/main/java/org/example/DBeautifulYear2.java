package org.example;

import java.util.Scanner;

public class DBeautifulYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    while(true){
        n = n + 1;
        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n / 10 % 10;
        int d = n % 10;
        if (a != b && a != c && a != d && b != c && b != d && c != d) {
            break;
        }
    }
        System.out.println(n);

    }
}
