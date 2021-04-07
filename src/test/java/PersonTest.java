import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void setNameTest(){
        Person person = new Person("Jonathin Makori");

        String expect = "Jonathin Makori";

        person.setName("Jonathin Mak");

        String actual = person.getName();

        Assert.assertEquals(expect,actual);


    }

    @Test
    public void getNameTest(){
        Person person = new Person();
        String expect = "Jonathin";
        String actual = person.getName();

        Assert.assertEquals(expect,actual);


    }




    @Test
    public void getAgeTest(){
        Person person = new Person();
        int expect = 23;

        person.setAge(23);
        int actual = person.getAge();


        Assert.assertEquals(expect,actual);

    }
}
