import java.util.*;
public class Server {

  private static ArrayList<Card> debitCards=new java.util.ArrayList<>();
  private static ArrayList<CreditCard> creditCards=new java.util.ArrayList<>();
  private static  HashMap<Card,Long> list=new HashMap<>();


    public static ArrayList<Card> getDebitCards() {
        return debitCards;
    }

    private static  HashMap<Customer,Long> list2=new HashMap<>();
   private static  HashMap<Long,Long> list1=new HashMap<>();
   public  ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }
    public  HashMap<Card, Long> getList() {
        return list;
    }

    public  HashMap<Long, Long> getList1() {
        return list1;
    }

    public  void setDebitCards(Card card) {
        debitCards.add(card);
    }
    public  void setCreditCards(CreditCard card) {
        creditCards.add(card);
    }

    public  void setList(Card card, long accountNumber) {
        list.put(card,accountNumber);
    }

    public  void setList1(long accountNumber,long balance) {
        list1.put(accountNumber,balance);
    }
    public  void setList2(Customer customer,long accountNumber) {
        list2.put(customer,accountNumber);
    }

}
