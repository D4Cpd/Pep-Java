package com.company;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks:");
        int marks=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Name:"+name);
        System.out.print("Remark:");
        if(marks>90 && marks<=100)
            System.out.println("Excellent");
        else if (marks>80 && marks<=90)
            System.out.println("Good");
        else if (marks>70 && marks<=80)
            System.out.println("Fair");
        else if(marks>60 && marks<=70)
            System.out.println("Meets Expectation");
        else if (marks>0 && marks<=60)
            System.out.println("Below Par");
        else
            System.out.println("Wrong Input");
    }
}
