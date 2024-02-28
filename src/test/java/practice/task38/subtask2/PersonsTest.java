package practice.task38.subtask2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonsTest {
    @Test
    public void getChildObjectsDataAndCounter() {
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

        Assertions.assertEquals("jobFIO", job.getFIO());
        Assertions.assertEquals("jobStatus", job.getStatus());
        Assertions.assertEquals("2000, jobPhoneNumber, jobAddress", job.getInfo());

        Assertions.assertEquals("clientFIO", client.getFIO());
        Assertions.assertEquals("clientStatus", client.getStatus());
        Assertions.assertEquals("2005, clientPhoneNumber, clientAddress", client.getInfo());

        Assertions.assertEquals("superviserFIO", superviser.getFIO());
        Assertions.assertEquals("superviserStatus", superviser.getStatus());
        Assertions.assertEquals("2010, superviserPhoneNumber, superviserAddress", superviser.getInfo());

        Assertions.assertEquals(2, Persons.count);
        Assertions.assertEquals(1, Persons.count_clients);
    }
}
