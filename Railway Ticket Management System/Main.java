import java.util.Scanner;

class Main{
  public static void main(String args[])
  {
    //For Login
      System.out.println(" \t\t\t Welcome to HUMSAFAR EXPRESS ");
      Verification credentials=new Verification();
      credentials.loginDetails();


    //Train Details
      Train trn=new Train();
      trn.getDetails();

      int numberOfPassengers=-1;
      Scanner sc=new Scanner(System.in);
      try{
      System.out.print("Enter Number of Passengers: ");
      numberOfPassengers = sc.nextInt();
      if(numberOfPassengers==0)
        System.exit(0);
    }
    catch(Exception e)
    {
      System.out.println("Wrong Information");
      System.exit(0);
    }


    //Passengers Details
      Passenger psg[]=new Passenger[numberOfPassengers];
      System.out.println("\n\t\t\t\t Passengers Details ");
      for(int i=0;i<numberOfPassengers;i++)
        {
          psg[i]=new Passenger();
          psg[i].getPassengerDetails(i+1,numberOfPassengers);
        }

      //Showing Ticket
      Tickets tkt=new Tickets();
      tkt.displayTicketDetails();
  }

}
