

 public class Deposit implements AmountDeposit{
    Server server=new Server();
    DataVerification verify=new Verification();
    DataValidation validating=new Validation();

    public void deposit()
    {long accountNumber=  verify.verification();
        if(accountNumber!=0)
        {
            long amount=validating.validation("Amount");
            server.getList1().replace(accountNumber, server.getList1().get(accountNumber)+amount);
            System.out.println("Amount is deposited successfully");
            System.out.println("Balance:"+ server.getList1().get(accountNumber));
        }
        else
        {
            System.out.println("Invalid details");
        }
    }

}
