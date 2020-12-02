import java.util.ArrayList;
import java.util.List;

public class SocialNetworks {
    List<Person> networkPeople;

    public SocialNetworks (){
        this.networkPeople = new ArrayList<>();
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
