import java.util.Scanner;

// Class to store Passengers Details
class Passenger{
  static Scanner sc=new Scanner(System.in);
  static protected int numberOfPassengers;
  protected String nameOfPassenger;
  protected int age;
  protected String gender;
  protected String nationality;
  static protected String contactNumber;
  //Method to get Passengers Details
  protected void getPassengerDetails(int psg, int n){
    numberOfPassengers=n;
    System.out.println();
    System.out.println("Passenger-"+psg);
    System.out.print("Name: ");
    nameOfPassenger=sc.nextLine();
    System.out.print("Age: ");
    age=sc.nextInt();
    sc.nextLine();
    System.out.print("Gender: ");
    gender=sc.nextLine();
    System.out.print("Nationality: ");
    nationality=sc.nextLine();
    System.out.println();
    if(n==psg)
    {
      System.out.print("Contact Number: ");
      contactNumber=sc.next();
      System.out.println("\nYour tickets have been booked successfully!!!!!!!");
    }
  }
}
