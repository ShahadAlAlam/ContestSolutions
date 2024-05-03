package org.example;
import java.util.Scanner;

public class BHitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] bills = {100, 20, 10, 5, 1};
        int res = 0;
        for (int i = 0; i < bills.length; i++) {
            res += n / bills[i];
            n %= bills[i];
        }
        System.out.println(res);
    }
}
