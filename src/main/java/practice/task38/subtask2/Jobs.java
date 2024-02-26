package practice.task38.subtask2;

public class Jobs extends Persons implements PersonInterface {
    public String status;
    public String phoneNumber;
    public Jobs(String FIO, int yearOfBirth, String address, String status, String phoneNumber) {
        super(FIO, yearOfBirth, address);
        this.status = status;
        this.phoneNumber = phoneNumber;
        Persons.count++;
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
