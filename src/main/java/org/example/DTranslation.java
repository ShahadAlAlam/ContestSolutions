package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DTranslation {

    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader( System.in));
        String str1 = scanner.readLine();
        String str2 = scanner.readLine();
        if (new StringBuffer(str1).reverse().toString().equals(new StringBuffer(str2).toString()) ){
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
