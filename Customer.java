import java.time.LocalDate;

public class Customer {
    private String name;
    private long panNumber;
    private LocalDate dateOfBirth;
    private long phoneNumber;
    Customer(String name,long panNumber,LocalDate dateOfBirth,long phoneNumber)
    {
        this.name=name;
        this.panNumber=panNumber;
        this.dateOfBirth=dateOfBirth;
        this.phoneNumber=phoneNumber;
    }
}
