package org.example;

public class RateLimitedCalculator {
    public static void main(String[] args) {
        System.out.println(getSum(1D,2.5D));
    }

    public static Double getSum(Double a,Double b){
        return (a+b);
    }
}
