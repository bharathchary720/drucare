package Bharath;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println(" enter the number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int i=1,f=1;
        for( i=1; i<=n;i++){
            f= f*i;

        }
        System.out.println(f);
    }
}
