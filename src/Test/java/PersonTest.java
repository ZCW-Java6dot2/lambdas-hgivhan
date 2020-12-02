import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void constructorTest(){
        Person person = new Person("Bob", LocalDate.of(1999, 12, 1), Person.Sex.MALE, "bob@bob.com");
        Assert.assertNotNull(person);
    }

    @Test
    public void nullaryConstructorTest(){
        Person person = new Person ();
        Assert.assertNotNull(person);
    }

    @Test
    public void getName(){
        Person person = new Person();
        String expected = "Janet";
        person.setName(expected);
        String actual = person.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void getEmail(){
        Person person = new Person();
        String expected = "janet@aol.com";
        person.setEmailAddress(expected);
        String actual = person.getEmailAddress();

        assertEquals(expected, actual);
    }
}
