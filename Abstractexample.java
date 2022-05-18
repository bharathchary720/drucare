package OOPS;

 abstract class  human {             /// abstract class
     public abstract void  eat ();      /// abstract method
     public void sleep(){
         System.out.println("    sleep method in human class");
     }
 }
 class  friends extends human {
     public void eat(){
         System.out.println("   eat method in friends class actually inherited from human class ");
     }
 }

public class Abstractexample {
    public static void main(String[] args) {
        friends f=new friends();
        f.eat();
        f.sleep();
    }

}
