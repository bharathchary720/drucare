package Bharath;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println(" enter first number , operator and  second number");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        char x=sc.next().charAt(0);
        int b= sc.nextInt();
        if (x=='+' ){
             int add= a+b;
            System.out.println(add);
        }
        if( x=='-'){
            int  sub = a-b;
            System.out.println(sub);

        } if ( x=='*'){
            int mul = a*b;
            System.out.println(mul);

        } if ( x=='%'){
            int mod=a%b;
            System.out.println(mod);
        }
        if ( x=='/'){
            int div=a/b;
            System.out.println(div);
        }

    }
}
