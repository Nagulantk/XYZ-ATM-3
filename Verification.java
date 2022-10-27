

public class Verification implements DataVerification{
    Validation validating=new Validation();
    Server server=new Server();

    public long verification()
    {
        long cardNumber=validating.validation("Card Number");

        long pin=validating.validation("Pin");
        for(Card card :server.getDebitCards())
        {
            if(card.cardNumber==cardNumber&&card.getPin()==pin)
            {
                return server.getList().get(card);
            }
        }
        for(CreditCard card:server.getCreditCards())
        {
            if(card.cardNumber==cardNumber&&card.getPin()==pin)
            {
                return cardNumber;
            }
        }
        return 0;

    }
}
