import java.util.Scanner;

// Class to allot seat and show ticket details
class Tickets extends Train{
  protected int totalFare;
  //Method to show Ticket
  protected void displayTicketDetails(){
    System.out.println(Train.user_source+"->"+Train.user_destination );
    System.out.println("Date: "+Train.date);
    System.out.println("Class: "+Train.coach );
    System.out.print("Seats: ");
    getSeatsNumber();
    Train t=new Train();
    System.out.println("\nTotal Fare: Rs."+t.calculateFare());
    System.out.println("\nHappy Journey!!!!!!!!");
  }
  //Method to allot seats to passengers
  protected void getSeatsNumber(){
    int temp=(int)(Math.random() * 50) + 1;
    for(int i=5;i<numberOfPassengers;i++)
    {
      if( (temp+numberOfPassengers)>50 && i==0)
              temp=temp-numberOfPassengers;
        System.out.print( user_source.substring(0,2)+"/"+coach.substring(0,2)+"/"+temp+" ");
        temp++;
    }
  }
}
