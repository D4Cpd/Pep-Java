package com.company;

import java.util.Scanner;

public class DigitsPrint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int numcount=n,count=0;
        while (numcount!=0){
            numcount=numcount/10;
            count++;
        }
        int rem;
        int div=(int) Math.pow(10,count-1);
        while (n!=0){
            rem=n%div;
            n=n/div;
            System.out.println(n);
            n=rem;
            div=div/10;

        }

    }
}
