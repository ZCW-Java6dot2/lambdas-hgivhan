import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person p1;
    private Person p2;
    private Person p3;
    List<Person> pList;
    LinkedList<String> ll = new LinkedList<>();

    @Before
    public void setup() {
        pList = new ArrayList<>();
        p1 = new Person("Mercer", LocalDate.of(1943, 12, 12), Person.Sex.MALE, "mercer@aol.com");
        p2 = new Person("Alyson", LocalDate.of(1950, 1, 1), Person.Sex.FEMALE, "alyson@aol.com");
        p3 = new Person("Monte", LocalDate.of(1972, 3, 13), Person.Sex.MALE, "monte@aol.com");
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
    }

    @Test
    public void constructorTest() {
        Person person = new Person("Bob", LocalDate.of(1999, 12, 1), Person.Sex.MALE, "bob@bob.com");
        Assert.assertNotNull(person);
    }

    @Test
    public void nullaryConstructorTest() {
        Person person = new Person();
        Assert.assertNotNull(person);
    }

    @Test
    public void getNameTest() {
        Person person = new Person();
        String expected = "Janet";
        person.setName(expected);
        String actual = person.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void getEmailTest() {
        Person person = new Person();
        String expected = "janet@aol.com";
        person.setEmailAddress(expected);
        String actual = person.getEmailAddress();

        assertEquals(expected, actual);
    }

    @Test
    public void getBirthDateTest() {
        LocalDate expected = LocalDate.of(1950, 1, 1);
        LocalDate actual = p2.getBirthday();
        assertEquals(expected, actual);
    }

    @Test
    public void getGenderTest() {
        Person.Sex expected = Person.Sex.MALE;
        Person.Sex actual = p1.getGender();
        assertEquals(expected, actual);
    }

    @Test
    public void ToStringTest() {
        String expected = "Person{" +
                "name='" + p3.getName() + '\'' +
                ", birthday=" + p3.getBirthday() +
                ", gender=" + p3.getGender() +
                ", emailAddress='" + p3.getEmailAddress() + '\'' +
                '}';
        String actual = p3.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest() {
        //given
        Person hillary = new Person("Hillary", LocalDate.of(1990, 01, 01), Person.Sex.FEMALE, "skillary1@gmail.com");
        int expectedAge = 30;
        //when
        int actualAge = hillary.getAge();
        //then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void printPersonTest() {
        //given
        Person kyle = new Person();
        //when
        kyle.printPerson();
        //then
        Assert.assertNotNull(kyle);
    }

    @Test
    public void printPersonOlderThanTest() {
        Person.printPersonsOlderThan(pList, 50);
    }

    @Test
    public void printPersonsWithinAgeRangeTest() {
        Person.printPersonsWithinAgeRange(pList, 30, 50);
    }

    @Test
    public void searchTest() {
        SocialNetworks networks = new SocialNetworks();
        Search search = new Search();
        Search.printPersons(networks.get(), search);
    }
}


