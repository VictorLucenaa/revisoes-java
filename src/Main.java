import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static List<Person> pessoas = new ArrayList<>();

    static {
        pessoas.add(new Person("victor", 26, "developer"));
        pessoas.add(new Person("lucena", 16, "dietitian"));
        pessoas.add(new Person("neymar", 29, "soccer player"));
        pessoas.add(new Person("kratos", 50, "god slayer"));

    }

    public static void main(String[] args) {

        // filtrar por idade
        List<Person> legalAge = pessoas.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());

        System.out.println(legalAge);


        //skip
        List<Person> skipOne =
                pessoas.stream()
                        .skip(1)
                        .limit(1)
                        .toList();

        System.out.println(skipOne);
    }


}
