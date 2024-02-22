package org.example;

import java.util.Scanner;

public class BVanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =scanner.nextInt();
        int h =scanner.nextInt();
        int width = 0;
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if(input>h){
                do{
                    width=width+1;
                    input=input-h;
                }while((input)>0);
            } else {
                width += 1;
            }
        }
        System.out.println(width);
    }
}
