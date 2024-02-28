package practice.task38.subtask2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonsTest {
    // TODO: переделать
    @Test
    public void createObjects() {
        PersonInterface job = new Jobs("jobFIO",
                2000,
                "jobAddress",
                "jobStatus",
                "jobPhoneNumber");

        PersonInterface client = new Clients("clientFIO",
                2005,
                "clientAddress",
                "clientStatus",
                "clientPhoneNumber");

        PersonInterface superviser = new Supervisers("superviserFIO",
                2010,
                "superviserAddress",
                "superviserStatus",
                "superviserPhoneNumber");

        System.out.println(job.getFIO());
        System.out.println(client.getFIO());
        System.out.println(superviser.getFIO());

        System.out.println(Persons.count);
        System.out.println(Persons.count_clients);
    }
}
