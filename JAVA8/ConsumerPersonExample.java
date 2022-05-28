
package JAVA8;



import java.util.List;
import java.util.function.Consumer;

public class ConsumerPersonExample {
    static Consumer<Person> c1 = (per) -> System.out.println(per);

    static Consumer<Person> c2 = (per) ->System.out.println(per.getName().toUpperCase());
    static 		List<Person> list = PersonRepository.getAllPersons();

    public static void main(String[] args) {

        //		list.forEach(c1);
        //		list.forEach(c2);  // all name changed to upper case
        //		list.forEach(c1.andThen(c2)); //defaultmethod
        printWithCondition();  //    calling method
    }
    //printing with condition(boys basket ball team)
    public static void printWithCondition(){     // created method here  which is main method
        list.forEach(per -> {
            if(per.getGender()=="Male"  && per.getHeight()>=140 && per.getSalary()<=5000) {
                c1.andThen(c2).accept(per);
            }
        });
    }



}