package practice.task38.subtask2;

public class Clients extends Persons implements PersonInterface {
    public String status;
    public String phoneNumber;
    public Clients(String FIO, int yearOfBirth, String address, String status, String phoneNumber) {
        super(FIO, yearOfBirth, address);
        this.status = status;
        this.phoneNumber = phoneNumber;
        Persons.count_clients++;
    }

    public String getFIO() {
        return FIO;
    }

    public String getStatus() {
        return status;
    }

    public String getInfo() {
        return yearOfBirth + ", " + phoneNumber + ", " + address;
    }
}
