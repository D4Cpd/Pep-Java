package com.company;

import java.util.Scanner;

public class Pattern12 {    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n=scn.nextInt();
    //  int a=0,b=1,c=0;
    //  System.out.print(a+"\n"+b);
    int a=0,b=1,c=0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(i==1 && j==1){
                System.out.print(a+"\t");}
            else if(i==2 && j==1){
                b=1;
                System.out.print(b+"\t");}
            else{

                c=a+b;
                System.out.print(c+"\t");
                a=b;
                b=c;

            }
            //    System.out.print(c+"\t");
        }System.out.println();
    }
}
}
