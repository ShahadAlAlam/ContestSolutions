package org.example;

import java.io.IOException;
import java.util.Scanner;

public class TeamC {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int[][] inputNum = new int[a][3];

        for(int i=0 ;i<a;i++) {
            inputNum[i][0] = scanner.nextInt();
            inputNum[i][1] = scanner.nextInt();
            inputNum[i][2] = scanner.nextInt();
        }
        System.out.println(getResult(inputNum));

    }

    public static int getResult(int a[][]){
        int inputLength = a.length;
        int result = 0;
        for(int i = 0 ; i<inputLength; i++){
            if(a[i][0]+a[i][1]+a[i][2] >=2 ){
                result++;
            }
        }
        return result;
    }
}
