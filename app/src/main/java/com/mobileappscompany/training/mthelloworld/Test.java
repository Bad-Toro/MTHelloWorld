package com.mobileappscompany.training.mthelloworld;

/**
 * Created by ferna on 4/25/2017.
 */

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello world!\n");

        int r = getNthFibo(7);

        System.out.println("F of 7 is: " + r + "\n\n");

        String oS = revIt("Hello world!","");
        System.out.println("The reverse is: " + oS + "\n\n");

        oS = revIt("Hello world!"," ");
        System.out.println("The reverse is: " + oS + "\n\n");

    }


    static int  getNthFibo (int n){

        if (n<3) return 1;

        return getNthFibo(n-1) + getNthFibo(n-2);
    }


    static String revIt(String s, String sp){

        String[] sA = s.split(sp);
        StringBuilder sb = new StringBuilder();

        for (int i = sA.length -1; i>=0; i--){
            sb.append(sA[i] + sp);
        }

        return sb.toString();
    }


}
