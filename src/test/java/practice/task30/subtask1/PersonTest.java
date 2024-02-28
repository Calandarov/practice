package practice.task30.subtask1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonTest {
    Person person;
    @Test
    public void correctSet() {
        person = new Person();
        person.setName("qw eаяZ -Я");
        person.setAge(200);
        person.setNumberCategory(5);
        person.setWeight(200);

        Assertions.assertEquals("qw eаяZ -Я", person.getName());
        Assertions.assertEquals(200, person.getAge());
        Assertions.assertEquals(5, person.getNumberCategory());
        Assertions.assertEquals(200, person.getWeight());
    }

    @Test
    public void incorrectSet() throws IllegalArgumentException {
        person = new Person();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            person.setName("qw*eаяZ -Я");
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            person.setAge(201);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            person.setNumberCategory(0);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            person.setWeight(201);
        });
    }
}
