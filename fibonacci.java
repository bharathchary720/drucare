package Bharath;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("  enter the number ");
        int n1 = 0, n2 = 1, n3=0, i, count=10;
        System.out.println( n1+" "+n2);
        for (i =2; i<= count;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;


        }




    }}

