import java.util.ArrayList;
public class TicketDriver
   {
   public static void main( String[] args )
      {
      Ticket walkup1 = new Walkup();
      Ticket advance1 = new Advance( 9 );            // 14 days
      Ticket stuAdvance1 = new StudentAdvance(  9 ); // 12 days
      Ticket advance2 = new Advance( 19 );            // 14 days
      Ticket stuAdvance2 = new StudentAdvance( 20 ); // 12 days
      
      ArrayList<Ticket> ticketHolder = new ArrayList<Ticket>();
      ticketHolder.add( walkup1 );
      ticketHolder.add( advance1 );
      ticketHolder.add( stuAdvance1 );
      ticketHolder.add( advance2 );
      ticketHolder.add( stuAdvance2 );
      
      for( Ticket singleTicket : ticketHolder )
         {
         System.out.println( singleTicket + "\n" );    
         } // end for each 
      } // end method main
   } // end class TicketDriver