package org.example;

import java.util.Scanner;

public class DFedorAndNewGame {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                int k = scanner.nextInt();

                int[] fArmy = new int[m + 1];
                for (int i = 0; i <= m; i++) {
                    fArmy[i] = scanner.nextInt();
                }

                int checkArmy = fArmy[m];
                int ans = 0;
                for (int i = 0; i < m; i++) {
                    int count = 0;
                    int diffBits = checkArmy ^ fArmy[i];
                    while (diffBits != 0) {
                        count += diffBits & 1;
                        diffBits >>= 1;
                    }
                    if (count<= k) {
                        ans++;
                    }
                }

                System.out.println(ans);
        }

}
