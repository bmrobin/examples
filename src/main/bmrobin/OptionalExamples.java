package bmrobin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {
        Person aPerson = new Person("Ben", null);

        Optional.ofNullable(aPerson.getFirstName())
                .ifPresent(System.out::println);

        // Get person last name, or Robinson if null
        String lastName = Optional.ofNullable(aPerson.getLastName()).orElse("Robinson");
        System.out.println(lastName);

        List<Person> people = new ArrayList<>();
        people.add(new Person(null, null));
        people.add(new Person("john", "doe"));
        people.add(new Person("mary", "jane"));
        people.add(new Person(null, "belew"));
        people.add(new Person("adrian", null));

        people.stream()
                .map(person -> new Person(Optional.ofNullable(person.getFirstName()).orElse("NO_FIRST"), Optional.ofNullable(person.getLastName()).orElse("NO_LAST")))
                .forEach(person -> System.out.println(person.toString()));
    }
}
