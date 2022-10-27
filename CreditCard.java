import java.time.LocalDate;

public class CreditCard extends Card {

    int creditCardDue = 0;

    CreditCard(int cardNumber, int pin, int ccv, LocalDate expiryDate) {
        super(cardNumber, pin, ccv,expiryDate);
    }

}
