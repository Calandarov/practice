package practice.task38.subtask1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonInterfaceTest {
    @Test
    public void getChildObjectsData() {
        PersonInterface job = new Jobs("jobFIO",
                "jobStatus",
                2000,
                "jobPhoneNumber",
                "jobAddress");

        PersonInterface client = new Clients("clientsFIO",
                "clientStatus",
                2005,
                "clientPhoneNumber",
                "clientAddress");

        PersonInterface superviser = new Supervisers("superviserFIO",
                "superviserStatus",
                2010,
                "superviserPhoneNumber",
                "superviserAddress");

        Assertions.assertEquals("jobFIO", job.getFIO());
        Assertions.assertEquals("jobStatus", job.getStatus());
        Assertions.assertEquals("2000, jobPhoneNumber, jobAddress", job.getInfo());

        Assertions.assertEquals("clientsFIO", client.getFIO());
        Assertions.assertEquals("clientStatus", client.getStatus());
        Assertions.assertEquals("2005, clientPhoneNumber, clientAddress", client.getInfo());

        Assertions.assertEquals("superviserFIO", superviser.getFIO());
        Assertions.assertEquals("superviserStatus", superviser.getStatus());
        Assertions.assertEquals("2010, superviserPhoneNumber, superviserAddress", superviser.getInfo());
    }
}
