package org.example;

import java.util.Scanner;

public class BMagnets {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int ans = 0 ;
            int prev = 0;
            int cur = 0;
            for (int i = 0; i < n; i++) {
                cur = scanner.nextInt();
                if(prev!=cur){
                    ans+=1;
                }
                prev=cur;
            }
            System.out.println(ans);
        }
}
