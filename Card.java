import java.time.LocalDate;

public class Card {
    int cardNumber;
    private  int ccv;
   private long pin;
   private LocalDate expiryDate;
    public long getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    Card(int cardNumber, int pin, int ccv,LocalDate expiryDate)
    {
        this.ccv=ccv;
        this.cardNumber=cardNumber;
        this.pin=pin;
        this.expiryDate=expiryDate;
    }
}
