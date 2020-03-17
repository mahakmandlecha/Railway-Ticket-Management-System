
import java.util.Scanner;
//Class for storing train details like source station, destination station and fare.
class Train extends Passenger
{
  Scanner sc = new Scanner(System.in);
  protected int choice;
  protected static int fare;
  protected static String user_source;
  protected static String user_destination;
  protected static String date;
  protected String from,to;
  protected static String coach;
  protected String[][] train=  { {"INDORE" , "BHOPAL","160"}  ,{ "INDORE", "MUMBAI" ,"440"},{"NEW DELHI","KOLKATA" ,"200"},{"NEW DELHI","DEHRADUN","250" }};

  //Getting details from user about source statin and destination station.
  void getDetails()
  {
    System.out.print("From: ");
    from = sc.nextLine();
    System.out.print("To: ");
    to = sc.nextLine();
    System.out.print("Date: ");
    date = sc.nextLine();
    checkTrain(from,to);
  }
  void checkTrain(String source, String to)
  {
    for(int i=0;i<4;i++)
    {
      if(train[i][0].equals(source) && train[i][1].equals(to))
      {
          choice =1;
          fare=Integer.parseInt(train[i][2]);
          user_source=train[i][0];
          user_destination=train[i][1];
          break;
      }
      else
      {
        choice=0;
      }
    }
    if(choice==0)
    {
      System.out.println("No train available for this route");
      System.exit(0);
    }
    else
    {
      book();
    }
  }
  void book()
  {
    System.out.println("Select the class in which you want to travel :\n");
    System.out.println("1 for AC");
    System.out.println("2 for SLEEPER");
    System.out.println("3 for SECOND SITTING");
    System.out.println();
    int ch;
    ch= sc.nextInt();
    System.out.println();
    switch(ch)
    {
      case 1:
        coach= "AC";
        System.out.println("Seats Available: 50\n ");
        break;
      case 2:
        coach = "SLEEPER";
        System.out.println("Seats Available: 50\n ");
        break;
      case 3:
        coach = "SECOND SITTING";
        System.out.println("Seats Available: 50\n ");
        break;
      default: System.out.println("Please select valid option\n");
                book();
    }

  }
    //Method to return total fare of journey
    protected int calculateFare()
    {
      return numberOfPassengers*fare;
    }
}
