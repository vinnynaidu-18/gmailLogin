package bankDemo;

public class cardProcessTest {
     public static  void main(String[] args) {
        cardProcessingService  processService = new cardProcessingService();
        CardDetails cardDetails = new CardDetails();
        cardDetails.cardNumber = "3993 5194 9976";
        cardDetails.pinNumber = "4436";
        System.out.println(cardDetails.hashCode());
        boolean loginStatus = processService.login(cardDetails);
        CreditService creditService = new CreditService();
        if(loginStatus){
            int balance = creditService.credit("3993 5194 9976",100);
            System.out.println(balance);
            System.out.println("CreditService hashcode"+creditService.hashCode());
            int balance2 = creditService.credit("3993 5194 9976",100);
            System.out.println(balance2);
        }

    }
}
