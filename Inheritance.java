package OOPS;
 class A{
     void m1(){
     int a =2;
     int b=2;
     int add=a+b;
      System.out.println(" add of two numbers "+ add);
 }
 }
 class B extends A {
      void m2(){
          int a=2;
          int b=2;
          int sub=a-b;
          System.out.println("sub of two numbers " + sub);

     }
 }



 class Inheritance  {
    public static void main(String[] args) {
       B b=new B(); // creating obj
        b.m1();     // calling method 
        b.m2();     // calling  method
    }}

