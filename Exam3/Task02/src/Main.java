import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        List<Person> people = Person.addPerson();
        LinkedList<Person> list= new LinkedList<>();
        list.add(new Person("Дуров", "Павел", "Дурович"));
        list.add(new Person("Дуров", "Павел", "Дурович"));

        System.out.println(list);


    }
}
