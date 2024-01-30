package ticketbooking;

import ticketbooking.Ticket;
import ticketbooking.TicketBookingService;

public class TicketTest {
    public static void main(String[] args) {
        Ticket t= new Ticket();
        TicketBookingService ts= new TicketBookingService();
        t=ts.bookTicket("Salar","Balcony","C",11);
        System.out.println(t);

    }

    }

