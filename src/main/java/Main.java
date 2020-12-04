public class Main {

    public static void main(String[] args) {
        SocialNetworks sn = new SocialNetworks();

        Search.printPersons(
                sn.getNetwork(),
                (Person p) -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25
        );
    }
}

