package org.example;


import java.util.Scanner;

public class DPoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int availableOfficers = 0;
        int untreatedCrimes = 0;
        for (int i = 0; i < n; i++) {
            int event = sc.nextInt();
            if (event > 0) {
                availableOfficers += event;
            } else {
                if (availableOfficers == 0) {
                    untreatedCrimes++;
                } else {
                    availableOfficers--;
                }
            }
        }
        System.out.println(untreatedCrimes);
    }

}


