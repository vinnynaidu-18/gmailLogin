package bankDemo;
public class cardProcessingService {
    boolean  login(CardDetails card) {
        System.out.println(card.hashCode());
        String localcardNumber = "3993 5194 9976";
        String localpinNumber = "4436";

        if (localcardNumber.equals(card.cardNumber) && localpinNumber.equals(card.pinNumber)) {
            return true;
        } else {
            return false;
        }
    }
}






