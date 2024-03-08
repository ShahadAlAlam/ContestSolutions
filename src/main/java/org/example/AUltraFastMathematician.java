package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AUltraFastMathematician {
    public static void main(String[] args) {
        BufferedReader b = new BufferedReader(new InputStreamReader( System.in));
        String s = null;
        String s1 = null;
        try {
            s = b.readLine();
            s1 = b.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StringBuffer x = new StringBuffer();
        for(int i=0 ; i<s.length(); i++){
            x.append( Integer.parseInt(String.valueOf( s.charAt(i)) )
                    ^ Integer.parseInt(String.valueOf( s1.charAt(i)) ) );
        }

        System.out.println(x.toString());
    }


}
