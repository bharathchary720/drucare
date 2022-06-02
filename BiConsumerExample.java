package  JAVA8;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;


public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<Integer,Integer> bc1 =(x,y) ->
                System.out.println(x+y);


        BiConsumer<Integer,Integer> bc2 =(x,y) ->
                System.out.println(x-y);

        bc1.accept(123, 321);
        bc2.accept(100, 50);
        bc1.andThen(bc2).accept(40, 40);
//
        // check two list are same size

        List<Integer> l1 = Arrays.asList(1,2,3,4);
        List<Integer> l2 = Arrays.asList(1,2,3);

        BiConsumer<List<Integer>,List<Integer>>  sizeCheck =
                (list1,list2) ->{
                    if(list1.size() == list2.size())
                        System.out.println("true");
                    else
                        System.out.println("false");
                };
        sizeCheck.accept(l1, l2);
    }

}