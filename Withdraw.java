import java.util.Scanner;

public class Withdraw implements AmountWithdraw {
    Server server=new Server();
    DataVerification verify=new Verification();
    DataValidation validating =new Validation();
    public void withdraw()
    {
        float tax;
        long accountNumber=  verify.verification();
        if(accountNumber!=0)
        {

            long amount=validating.validation("Amount");
            if(amount%5==0&&amount<= server.getList1().get(accountNumber))
            {
                if(amount<=100)
                {
                    tax=0.02f;
                }
                else {
                    tax=0.04f;
                }
                server.getList1().replace(accountNumber,  server.getList1().get(accountNumber) - amount-(int)(amount*tax));
                System.out.println("Amount is withdrawn successfully");
                System.out.println("Balance:" +  server.getList1().get(accountNumber));
                System.out.println("Tax:"+amount*tax);

            }
            else
            {
                System.out.println("Insufficient balance or Enter amount divisible by 5");
            }
        }
        else
        {
            System.out.println("Invalid details");
        }
    }
}
