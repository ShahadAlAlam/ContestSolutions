package org.example;

import java.util.Scanner;

public class CGeorgeAndAccommodation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] m = new int[n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int j = scanner.nextInt();
                int k = scanner.nextInt();
                if((k-j)>=2){
                    ans+=1;
                }
            }
            System.out.println(ans);

        }
}
