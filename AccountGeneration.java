import java.time.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class AccountGeneration {

Scanner input=new Scanner(System.in);
Server server=new Server();
DataValidation validating=new Validation();
DateVerification dateVerification=new VerifyDate();

    static int generatingAccountNumber=1000000;
    static int generatingDebitCardNumber=10000;
    static int generatingCreditCardNumber=22334455;
    static int generatingCcv=300;
    static int generatingPin=1000;
    Accounts accounts;
    Customer customer;
    public void accountGeneration()
    {   System.out.println("Enter Name:");
        String name=input.nextLine();
        long phoneNumber=validating.validation("Phone number");
        LocalDate dateOfBirth=dateVerification.verifyDate();
        System.out.println(dateOfBirth);
        Date date1=new Date();
        SimpleDateFormat dateForm=new SimpleDateFormat("yyyy-MM-dd");
        String d=dateForm.format(date1);
        LocalDate dateOf=LocalDate.parse(d);
        LocalDate expiryDate=dateOf.plusYears(5);
        System.out.println("Expiry Date : "+expiryDate.getMonth()+"/"+expiryDate.getYear());
        long panNumber=validating.validation("Pan card Number");
        long balance=validating.validation("Balance");
        accounts=new Accounts(balance,generatingAccountNumber);
       customer=new Customer(name,phoneNumber,dateOfBirth,panNumber);
        Card card=new DebitCard(generatingDebitCardNumber,generatingPin,generatingCcv,expiryDate);
       server.setDebitCards(card);
       server.setList(card,generatingAccountNumber);
       server.setList1(generatingAccountNumber,balance);
       server.setList2(customer,generatingAccountNumber);
       System.out.println("Your Account Details:");
       System.out.println("AccountNumber:"+generatingAccountNumber);
       System.out.println("Debit cardNumber:"+generatingDebitCardNumber);
       System.out.println("Pin:"+generatingPin);
       generatingDebitCardNumber++;
       generatingPin++;
      generatingCcv++;
       generatingAccountNumber++;

    }

   }


