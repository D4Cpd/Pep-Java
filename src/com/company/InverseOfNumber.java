package com.company;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0,count=0,temp=n;
        while (temp!=0){
            temp=temp/10;
            count++;
            }
        int div=(int) Math.pow(10,count-1);
        while (div!=0){

            i=i+(n%10)*div;
            n=n/10;
            div=div/10;



        }
        System.out.println(i);
    }
}
