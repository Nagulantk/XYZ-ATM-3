import java.util.ArrayList;

public class CreditCardDue implements CreditCardDueBalance{
    Server server=new Server();
    DataVerification verify=new Verification();
    public void creditCardDueBalance()
    {
        long cardNumber= verify.verification();
        ArrayList<CreditCard> creditCards=server.getCreditCards();
        for(CreditCard card:creditCards)
        {
            if(card.cardNumber==cardNumber)
            {
               System.out.println("Credit card due:"+card.creditCardDue);
            }
        }
    }
}
