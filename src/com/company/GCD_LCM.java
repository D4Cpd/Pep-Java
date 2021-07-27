package com.company;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int rem=0;
        int o1=num1,o2=num2;
        while(num1%num2!=0){
            rem=num1%num2;
            num1=num2;
            num2=rem;
        }
        int gcd=rem;
        int lcm=(o1*o2)/gcd;
        System.out.println(gcd+"\n"+lcm);
}}
