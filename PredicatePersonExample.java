package JAVA8;


import java.util.List;
import java.util.function.Predicate;

import JAVA8.Person;
import JAVA8.PersonRepository;

//     height  gender checking
public class PredicatePersonExample {
    static Predicate<Person> heightPredicate = per-> per.getHeight() >= 140;
    static Predicate<Person> genderPredicate = per-> per.getGender().equals("Male" );

    public static void main(String[] args) {
        List<Person> list = PersonRepository.getAllPersons();
        list.forEach((per) ->{
            if(heightPredicate.and(genderPredicate).test(per))// based on requirement
                System.out.println(per);
        });
    }
}