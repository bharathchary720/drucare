package OOPS;

 class Staticmethodexample {
     public void m1(int i){
         System.out.println( "   this is  m1  method  with int  type");
     }
     static void m1( String s ){
         System.out.println(" this is m2 method with string type");
     }

     public static void main(String[] args) {
          Staticmethodexample d =new Staticmethodexample();
          d.m1( 10);
          Staticmethodexample.m1("bharath");
     }

     }

