package org.example;

import java.util.Scanner;

public class DReverseASubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenStr = sc.nextInt();
        String str = sc.next();
        sc.close();
        int stPos = -1, endPos = -1;
        for (int i = 0; i < lenStr - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                stPos = i + 1;
                endPos = i + 2;
                break;
            }
        }

        if (stPos!=-1 && endPos!=-1) {
            System.out.println("YES");
            System.out.println(stPos + " " + endPos);
        } else {
            System.out.println("NO");
        }
    }
}
