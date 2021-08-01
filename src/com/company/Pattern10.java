package com.company;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int sp=n/2,st=1,sp1=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<n/2+1)
                sp--;
            else
                sp++;
            for(int j=1;j<=sp1;j++){
                if(i==1 || i==n)
                    System.out.print("");
                else
                    System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                if(i==1 || i==n)
                    System.out.print("");
                else
                    System.out.print("*\t");
            }
            if(i<n/2+1)
                sp1++;
            else
                sp1--;
            System.out.println();
        }
    }
    }
