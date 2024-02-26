package practice.task38.subtask1;

import org.junit.Test;

public class PersonInterfaceTest {
    // TODO: переделать
    @Test
    public void createObject() {
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
                "superviserPhoneNubmer",
                "superviserAddress");

        System.out.println(job.getFIO());
        System.out.println(job.getStatus());
        System.out.println(job.getInfo());

        System.out.println(client.getFIO());
        System.out.println(client.getStatus());
        System.out.println(client.getInfo());

        System.out.println(superviser.getFIO());
        System.out.println(superviser.getStatus());
        System.out.println(superviser.getInfo());
    }
}
