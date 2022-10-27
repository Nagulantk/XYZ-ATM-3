public class DebitCardSwipe {
    DataVerification verify = new Verification();
   DataValidation validating = new Validation();
    Server server = new Server();

    public void swipe() {
        long accountNumber = verify.verification();
        if (accountNumber != 0) {

            long amount = validating.validation("Purchase Amount");
            if (amount <= server.getList1().get(accountNumber)) {
                server.getList1().replace(accountNumber, server.getList1().get(accountNumber) - amount + (int) (amount * 0.01));
                System.out.println("purchase is successfully");
                System.out.println("Cashback:" + amount * 0.01);
                System.out.println("Balance:" + server.getList1().get(accountNumber));
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid details");
        }
    }
}
