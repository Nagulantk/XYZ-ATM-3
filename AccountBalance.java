public class AccountBalance implements Balance {
    DataVerification verify=new Verification();
    Server server=new Server();
    public void getBalance()
    {long accountNumber= verify.verification();
        if(accountNumber!=0)
        {System.out.println("Balance:"+ server.getList1().get(accountNumber));}
        else {
            System.out.println("Enter valid details");
        }
    }
}
