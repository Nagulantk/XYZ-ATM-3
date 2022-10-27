import java.util.ArrayList;
import java.util.HashMap;

public class CreditCardBill {
    Server server=new Server();
    DataVerification verify=new Verification();

    public void billPayment()
    {
     long   cardNumber= verify.verification();
        ArrayList<CreditCard> creditCards = server.getCreditCards();
        HashMap<Card,Long> list=server.getList();
        HashMap<Long,Long> list1=server.getList1();
        for (CreditCard card : creditCards) {
            if (card.cardNumber == cardNumber) {
                 long accountNumber=list.get(card);
                  if(card.creditCardDue<=list1.get(accountNumber))
                  {
                      list1.replace(accountNumber,list1.get(accountNumber)-card.creditCardDue);
                      card.creditCardDue=0;
                      System.out.println("Bill payment is SuccessFull");
                      System.out.println("Remaining balance in the account:"+list1.get(accountNumber));
                  }
                  else
                  {
                      System.out.println("Insufficient balance in the account");
                  }
            }
        }
    }
}
