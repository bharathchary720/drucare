package JAVA8;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c1 =( s) ->System.out.println(s.toLowerCase());
        //Left side functionalInterface, right side lambda expression
        //		//		only FI can receive a lambda expression
        c1.accept("HELLO"); //callling it

        Consumer<String> c2 = (s1)-> System.out.println(s1.toUpperCase());
        c2.accept("hyderabad");
        c1.andThen(c2).accept("hello World");  // used default

        Consumer<Integer> c3 = (s)-> System.out.println(s+5);
        //		c1.andThen(c3).accept("java features is ");  // error shown
        Consumer<Integer> c4 = (s)-> System.out.println(s*10);

        c3.andThen(c4).accept(5);



    }

}