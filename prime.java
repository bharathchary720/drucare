package Bharath;

import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println(" enter the number");
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();


        for ( int i=1; i<=n;i++)
        {
            if (n % i == 0) {
                count++;
            }}
            if (count == 2) {
                System.out.println(" the given number is prime number ");
               // break;
            }
            if (count != 2) {
                System.out.println(" the given number is not prime number");
                //break;
            }


        }
    }

