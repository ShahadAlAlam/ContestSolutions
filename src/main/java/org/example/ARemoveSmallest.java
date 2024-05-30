package org.example;

import java.util.Scanner;

public class ARemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int numLen = sc.nextInt();
            int[] nums = new int[2];
            boolean res = true;
            nums[0] = sc.nextInt();
            for (int j = 1; j < numLen; j++) {
                nums[1] = sc.nextInt();
                int absInt = Math.abs(nums[0] - nums[1]);
                if (absInt > 1)
                    res = false;
                else {
                    if (nums[0] < nums[1])
                        nums[0] = nums[1];
                }
            }

            if (res) {
                System.out.println("YES");
            } else
                System.out.println("NO");


        }
        sc.close();
    }
}
