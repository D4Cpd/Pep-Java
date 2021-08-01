package com.company;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int sp=0,st=1,sp1=n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=n/2)
                sp++;
            else
                sp--;
            for(int j=1;j<=sp1;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                if(i==n/2+1)
                    System.out.print("");
                else
                    System.out.print("*\t");
            }
            if(i<n/2+1)
                sp1=sp1-2;
            else
                sp1=sp1+2;
            System.out.println();

        }
    }
}
