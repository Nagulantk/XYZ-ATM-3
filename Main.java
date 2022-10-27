import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        boolean condition=true;
        char card;
      XyzAtm atm=new XyzAtm();
        SwipeMachine machine=new SwipeMachine();
        AccountGeneration newAccount=new AccountGeneration();
        while (condition) {
            displayMenu();
            switch (input.next().charAt(0)) {
                case '0':

                        newAccount.accountGeneration();
                        break;
                case '1':
                   atm.deposit.deposit();
                    break;
                case '2':
                    System.out.println("Withdraw using Debit card or Credit card:D or C");
                     card=input.next().charAt(0);
                    if(card=='D'){
                        atm.withdraw.withdraw();
                    }
                    else if(card=='C'){
                        atm.creditCardWithdraw.creditCardWithdraw();
                    }
                    else {
                        System.out.println("Enter a valid card");
                    }
                    break;
                case '3':
                    System.out.println("Swipe using Debit card or Credit card:D or C");
                     card=input.next().charAt(0);
                    if(card=='D'){
                    machine.debitCardSwipe.swipe();}
                    else if(card=='C'){
                    machine.creditCardSwipe.creditCardSwiping();
                    }
                    else {
                        System.out.println("Enter a valid card");
                    }
                    break;
                case '4':
                    atm.balance.getBalance();
                    break;
                case '5':
                    CreditCardGeneration generation=new CreditCardGeneration();
                 generation.creditCardGeneration();
                    break;
                case '6':
                   atm.due.creditCardDueBalance();
                    break;
                case '7':CreditCardBill bill=new CreditCardBill();
                bill.billPayment();
                break;

                case '8':condition=false;
                    System.out.println("Thank you");
                    break;
                default:System.out.println("Enter a valid request");
                break;
            }
        }
    }
    public static void displayMenu()
    {
        System.out.println("Enter the action to be performed");
        System.out.println("0.Create an Account");
        System.out.println("1.Deposit Amount");
        System.out.println("2.Withdraw Amount");
        System.out.println("3.swipe for shopping");
        System.out.println("4.Get balance");
        System.out.println("5.New Credit card");
        System.out.println("6.View credit card due balance");
        System.out.println("7.Pay credit card bills");
        System.out.println("8.Exit");
    }

}