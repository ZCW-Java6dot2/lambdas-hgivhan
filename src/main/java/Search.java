import java.util.List;

public class Search implements CheckPerson{
    @Override
    public boolean test(Person p) {
        return p.gender == Person.Sex.FEMALE &&
                p.getAge() >= 0 &&
                p.getAge() <= 80;
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
