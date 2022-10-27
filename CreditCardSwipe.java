import java.util.ArrayList;

public class CreditCardSwipe {
    Server server=new Server();
  DataVerification verify=new Verification();
    DataValidation validating=new Validation();

    public void creditCardSwiping()
    {
        long cardNumber= verify.verification();
        if(cardNumber!=0) {
            System.out.println("Enter the purchase amount(limit -100000):");
            long amount = validating.validation("Amount");
            ArrayList<CreditCard> creditCards=server.getCreditCards();
            for(CreditCard card:creditCards)
            {
                if(card.cardNumber==cardNumber)
                {
                    card.creditCardDue+=amount-(int)(amount*0.01);
                    System.out.println("purchase is successfully");
                    System.out.println("Cashback:"+amount*0.01);
                    System.out.println("Credit card Due:"+card.creditCardDue);
                }
            }

        }
        else
        {
            System.out.println("Invalid details");
        }

    }
}
