import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class CreditCardGeneration {
    DataValidation validating = new Validation();
    Server server=new Server();
    AccountGeneration generation = new AccountGeneration();
    AccountNumberVerification verification=new AccountNumberVerification();

    public void creditCardGeneration() {

        long accountNumber = validating.validation("Account number");
        if (verification.accountNumberVerification(accountNumber)) {
            Date date1 = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-mm-dd");
            String d = dateForm.format(date1);
            LocalDate dateOf = LocalDate.parse(d);
            LocalDate expiryDate = dateOf.plusYears(5);
            CreditCard card = new CreditCard(generation.generatingCreditCardNumber, generation.generatingPin, generation.generatingCcv, expiryDate);
            server.setCreditCards(card);
            server.setList(card, accountNumber);
            System.out.println("Credit card Details");
            System.out.println("CreditCard Number:" + generation.generatingCreditCardNumber++);
            System.out.println("Pin:" + generation.generatingPin++);
            System.out.println("ccv:" + generation.generatingCcv++);
            System.out.println("Expiry Date : " + expiryDate.getMonth() + "/" + expiryDate.getYear());

        } else {
            System.out.println("Enter a valid Account number");
        }


    }
}
