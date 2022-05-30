package JAVA8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {

        List<String> citiList = Arrays.asList("hyderabad"," chennai",
                "mumbai","delhi");

        /// 1. converting in to uppercase
        List<String> outputList = citiList.stream()
        .map(s ->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(outputList);



        /// 2. length >6
        List<String> responseList = citiList.stream().filter(s-> s.length()>6)
                .map(s ->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(responseList);

 /// 3. start with c
        List<String> startsList = citiList.stream().filter(s-> s.startsWith("c"))
                .map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(startsList);


///  4.sorting the cities
        List<String> sortedList=citiList.stream().sorted()
                .map( s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(sortedList);

        /// 5. concat with metro

        List<String> appendsList = citiList.stream().map(s->s.concat(" metro"))
                .map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(appendsList);


        /// 6.  counting the cities

        Long countlist=citiList.stream().filter(s->s.length()>0).count();
        System.out.println(countlist);

        /// 7.find the first element
        String findFirstList = citiList.stream().findFirst().get();
        System.out.println(findFirstList);

    }
}
