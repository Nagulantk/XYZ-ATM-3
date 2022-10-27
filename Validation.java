import java.util.Scanner;

public class Validation implements DataValidation{
    Scanner input=new Scanner(System.in);
    public long validation(String name)
    {long balance=0;
        boolean number=true;
        do
        {System.out.println("Enter the "+name);
            if(input.hasNextLong())
            {
                balance=input.nextLong();
                number=false;
            }
            else
            {
                System.out.println("Enter the valid "+name);
                input.next();
            }
        }while(number);
        return balance;
    }
}
