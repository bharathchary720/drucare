package OOPS;

class Animal {                     /// parent class
     public void animalSound(){
         System.out.println(" the animal makes  a sound");
     }
}
 class  Dog extends Animal{         /// child class
     @Override
     public void animalSound() {
         super.animalSound();    /// call the super class
         System.out.println(" th Dog bow bow");
     }
 }

  class Main{
     public static void main(String[] args){
         Animal mydog =new Dog();    /// create a dog object
         mydog.animalSound();         /// call the  method on the dog object

     }
     }

