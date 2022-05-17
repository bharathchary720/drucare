package OOPS;

  class Staticcontrolflowexample {
     static  int a=10;

      public static void main(String[] args) {

          bike(); // calling static method bike
          System.out.println(" main method has finished its execution");
      }
      static {
          System.out.println(" inside the 1st  block -top ");
          bike();
          System.out.println(" inside 1st static block - bottom");
      }

      public static void bike()
      {
          System.out.println( " hello");

      }

      static {
          System.out.println(" inside 2nd static block");
      }

       static int b=10;


}
