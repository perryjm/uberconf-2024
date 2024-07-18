import java.util.*;
import static java.util.Comparator.*;

class Person {
  private final String name;
  private final int age;

  public Person(String theName, int theAge) {
    name = theName;
    age = theAge;
  }

  public String getName() { return name; }
  public int getAge() { return age; }

  public String toString() { return name + ": " + age; }
}

public class Sample {
  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
      new Person("Sara", 32),
      new Person("Bob", 32),
      new Person("Sara", 42),
      new Person("Paula", 12),
      new Person("Joe", 72),
      new Person("Joe", 17)
    );

    people.stream()
      //.sorted(comparing((Person person) -> person.getName()))
      .sorted(comparing(person -> person.getName()))
      .forEach(System.out::println);

      //.sorted(comparing(person -> person.getName()))
      //The compiler does not know what person is. So, it look
      //to the definition. comparing(Function<T, R>)
      //and returns Comparator<T>
      //them passes that to Sorted which is on the Stream<T>.
      //It is able to infer that T stands for Person.
      //It examines the context around to figure the type and 
      //in this case it succeeded.

    System.out.println("----");

    people.stream()
      //.sorted(comparing((Person person) -> person.getName()).reversed())
      .sorted(comparing(Person::getName).reversed())
      //.sorted(comparing(person -> person.getName()).reversed()) //ERROR
      .forEach(System.out::println);

      //.sorted(comparing(person -> person.getName()).reversed())
      //The compiler does not know what person is, it needs context.
      //comparing take Function<T, R> and returns a Comparator<T>.
      //We then pass that Comparator to reversed.
      //Comparator<T>.reversed() return Comparator<T>.
      //From T we went to T, sorry I have no clue from that
      //what T is, so the compiler assume T is Object.

      //To resolve this we either have to do one of the following:
      //.sorted(comparing((Person person) -> person.getName()).reversed())
      //.sorted(comparing(Person::getName).reversed())
      //where the type is inferred because the context is known
      //for the Function<T, R>, here T is Person.
  }
}

