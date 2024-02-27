package practice.task38.subtask1;

public class Jobs implements PersonInterface {
    private String FIO;
    private String status;
    private int yearOfBirth;
    private String phoneNumber;
    private String address;

    public Jobs(String FIO, String status, int yearOfBirth, String phoneNumber, String address) {
        this.FIO = FIO;
        this.status = status;
        this.yearOfBirth = yearOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
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
