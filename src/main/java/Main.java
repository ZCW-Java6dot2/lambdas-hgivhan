public class Main {

    public static void main(String[] args) {
        class checkInfo implements CheckPerson {
            @Override
            public boolean test(Person p) {
                return p.gender == Person.Sex.FEMALE &&
                        p.getAge() >= 0 &&
                        p.getAge() <= 80;
            }

        }
    SocialNetworks sn = new SocialNetworks();
    CheckPerson info = new checkInfo();
    Search.printPersons(sn.networkPeople, info);

    }

