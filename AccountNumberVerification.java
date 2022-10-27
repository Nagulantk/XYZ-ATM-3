import java.util.Map;

public class AccountNumberVerification {
    Server server=new Server();
    public boolean accountNumberVerification(long accountNumber)
    {
        for(Map.Entry<Long,Long> accountList:server.getList1().entrySet())
        {
            if(accountList.getKey()==accountNumber)
            {
                return true;
            }
        }
        return false;
    }

}
