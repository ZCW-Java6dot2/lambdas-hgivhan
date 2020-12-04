public class Main {

    public static void main(String[] args) {
        CheckPerson isMale = new CheckPerson(){
            public boolean test(Person p){
                return(p.gender.equals(Person.Sex.MALE));
            }
        }; // class body with method inside, but not class body named
        //anonymous class

        SocialNetworks sn = new SocialNetworks();
        Search.printPersons(sn.networkPeople, isMale);
    }
}


