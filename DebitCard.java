
import java.time.LocalDate;
public class DebitCard extends Card{
    DebitCard(int cardNumber, int pin, int ccv,LocalDate expiryDate)
    {
        super( cardNumber, pin, ccv,expiryDate);
    }
}
