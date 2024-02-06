package org.leetcode;

import java.text.DecimalFormat;
import java.util.*;

public class MaximumAverageSubarrayI_643 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        double d = s.nextDouble();
//        int k = s.nextDouble();
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
//        int[] nums = {-1};
//        int k = 1;
        System.out.println(findMaxAverage(nums,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int sumVal = 0;
        int j = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(i<k){
                sumVal=sumVal+nums[i];
            } else {
                sumVal=sumVal+nums[i]-nums[i-k];
            }
            if(maxSum<sumVal || i<k){
                maxSum = sumVal;
            }
        }
        return (double) maxSum/k;
    }
}
