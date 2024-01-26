package org.example;

import java.util.Scanner;

public class StrangeSum {
    public static void main(String[] args) {
        int maxFirst = 0;
        int maxSecond = 0;
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        while (len>0){
            int j = s.nextInt();
            if(j>=maxFirst){
                maxSecond = maxFirst;
                maxFirst = j;
            } else if (j>=maxSecond) {
                maxSecond = j;
            }
            len--;
        }
        if((maxFirst+maxSecond)>=0) {
            System.out.println((maxFirst+maxSecond));
        } else {
            System.out.println(0);
        }
    }
}
/*
problem
Description
Given a sequence a1,a2,…,an.
You are going to select zero or more elements of a so that: if you select ai, then in any interval of length i (formally, in a[j,j+i−1] for any (1≤j≤n−i+1) you can select at most 22 elements.
Calculate the maximal sum of the elements you select.
Input
The first line contains an integer n (2≤n≤10^5 ).
The second line contains n integers 1,2,…,a1,a2,…,an (−109≤109−109≤ai≤109).
Output
Output a single integer denoting the answer.

Sample 1
Inputcopy	Outputcopy
4           7
1 4 3 2

Sample 2
Inputcopy	Outputcopy
3           0
-10 -10 -10

 */