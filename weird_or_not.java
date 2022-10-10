package com.java_package;
import java.util.Scanner;

public class weird_or_not {
    public static void main(String[] args){
        System.out.println("Enter a num to check whether its Weird_or_Not:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2!=0){
            System.out.println("Weird");
        }else if (n%2==0 && n>=2 && n<=5){
            System.out.println("Not Weird");
        }else if (n%2==0 && n>=5 && n<=20){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }

    }
}
