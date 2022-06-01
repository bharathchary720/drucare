package CHILL;

import java.util.Scanner;

interface Inter {
    public int add ( int k);   /// one abstract method
    }


public class LambdaExample {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        Inter i=k -> n+n;           /// lambda expression
        System.out.println(i.add(n));
        System.out.println(" calling the method using functional interface ");
    }
}
