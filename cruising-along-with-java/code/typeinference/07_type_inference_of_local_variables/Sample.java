import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //String hello = "greet";
    var hello = "greet";

    System.out.println(hello);

    //What is the big deal here?

    //If the type is obvious we do not have to say the type.
    //Type inference is a wink at the compiler.

    //There is *no* var type. The type of the variable is what
    //ever the type really is. In this case, it is String.

    //It is very useful when the type is verbose but obvious.
    //Map<SomeDomainObject, List<SomeOtherDomainObject>> ...
    //var ...

    //List<String> names = List.of("Tom", "Jerry");
    var names = List.of("Tom", "Jerry");

    //for(String name: names) {
    for(var name: names) {
      System.out.println(name);
    }

    //try(var file = new File...)
  }
}

