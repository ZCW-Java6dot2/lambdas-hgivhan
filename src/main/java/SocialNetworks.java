import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SocialNetworks {
    List<Person> networkPeople;

    public SocialNetworks (){
        this.networkPeople = new ArrayList<>();
        networkPeople.add(new Person("Sharon", LocalDate.of(1999, 11, 18), Person.Sex.FEMALE, "sharon@sharon.com" )); //delete nullary person const, make 5 ppl, and then main should run
        networkPeople.add(new Person("Shawn", LocalDate.of(1950, 11, 17), Person.Sex.MALE, "shawn@shawn.com" ));
        networkPeople.add(new Person("Sharlin", LocalDate.of(1990, 3, 18), Person.Sex.FEMALE, "sharlin@sharlin.com" ));
        networkPeople.add(new Person("Shannon", LocalDate.of(1991, 4, 18), Person.Sex.FEMALE, "shannon@shannon.com" ));
        networkPeople.add(new Person("Shawnjawn", LocalDate.of(1995, 3, 31), Person.Sex.MALE, "shawnjawn@shawnjawn.com" ));

    }

    public SocialNetworks(Person p){
        this.networkPeople = new ArrayList<>();
        networkPeople.add(p);
    }

    public List<Person> getNetwork(){
        return networkPeople;
    }

    public void add(Person p){
        networkPeople.add(p);
    }

    public List<Person> get(){
        return networkPeople;
    }


}
