package practice.task30.subtask1;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void correctSet() {
        Person person = new Person();
        person.setName("qw eаяZ -Я");
        person.setAge(200);
        person.setNumberCategory(5);
        person.setWeight(200);

        Assert.assertEquals("qw eаяZ -Я", person.getName());
        Assert.assertEquals(200, person.getAge());
        Assert.assertEquals(5, person.getNumberCategory());
        Assert.assertEquals(200, person.getWeight());
    }

//    @Test
//    public void incorrectSet() {
//        Person person = new Person();
//        person.setName("qw*eаяZ -Я");
//        person.setAge(201);
//        person.setNumberCategory(0);
//        person.setWeight(201);
//    }
}
