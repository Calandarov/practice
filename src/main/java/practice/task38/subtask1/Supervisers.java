package practice.task38.subtask1;

public class Supervisers implements PersonInterface {
    public String FIO;
    public String status;
    public int yearOfBirth;
    public String phoneNumber;
    public String address;

    public Supervisers(String FIO, String status, int yearOfBirth, String phoneNumber, String address) {
        this.FIO = FIO;
        this.status = status;
        this.yearOfBirth = yearOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
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
