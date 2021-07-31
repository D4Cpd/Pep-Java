package com.company;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        // write ur code here
        for(int i=n;i>0;i--){
            for(int j=1;j<=n;j++){
                if(j>=i)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }System.out.println();
        }
    }
}
