package org.leetcode;

public class FindTheHighestAltitude_1732 {
    public static void main(String[] args) {
//        int[] a = {-5,1,5,0,-7};
        int[] a = {-4,-3,-2,-1,4,3,2};

        System.out.println(largestAltitude(a));

    }

    public static int largestAltitude(int[] gain) {
    int maxHal = 0;
    int sumHal = 0;

    for(int i=0; i< gain.length; i++){
        sumHal+=gain[i];

        if(maxHal<sumHal){
            maxHal=sumHal;
        }
    }
    return  (maxHal>0?maxHal:0);
    }

    public interface MyComp{
        public boolean comp(int a, int b);
    }
}
