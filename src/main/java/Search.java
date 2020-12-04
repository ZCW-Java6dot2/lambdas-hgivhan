import java.util.ArrayList;
import java.util.List;

public class Search {
    List<Person> roster = new ArrayList<>();

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}

