import java.util.*;

public class CreditCardWithdraw implements CreditCardAmountWithdraw{
 DataVerification verify=new Verification();
Server server=new Server();

DataValidation validating=new Validation();
public void creditCardWithdraw()
    {
        long cardNumber= verify.verification();
        if(cardNumber!=0) {
            System.out.println("Enter the withdraw amount(limit -100000):");

            long amount=validating.validation("Amount");
            if(amount<=100000) {
                ArrayList<CreditCard> creditCards = server.getCreditCards();
                for (CreditCard card : creditCards) {
                    if (card.cardNumber == cardNumber) {
                        if(amount<=100) {
                            card.creditCardDue += amount + (int) (amount * 0.02);
                            System.out.println("Amount is withdrawn");
                            System.out.println("Tax:" + amount * 0.02);
                        }
                        else {
                            card.creditCardDue += amount + (int) (amount * 0.04);
                            System.out.println("Amount is withdrawn");
                            System.out.println("Tax:" + amount * 0.04);
                        }
                        System.out.println("Credit card Due:" + card.creditCardDue);
                    }
                }
            }

        }
        else
        {
            System.out.println("Invalid details");
        }
    }


}
