package SmartParkingSystem;

import java.util.Scanner;

public class Main
{
    public static Scanner sc;
    public static void main(String[] args)
    {
        sc=new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("\t\tWelcome to JJ parking slot bookings!");
        boolean runner=true;
        while (runner)
        {
            System.out.println("parking slot pre booking : press 1");
            System.out.println("Login as Admin : Press 2");
            System.out.println("Exit the app! : Press 3");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input)
            {
                case 1:
                    System.out.println("\tBook a Slot");
                    SlotBooking booking = new SlotBooking(sc);
                    booking.doBooking();
                    break;

                case 2:
                    System.out.println("\tYou are entered to log in as admin !");
                    AdminLogIn adminLogIn = new AdminLogIn(sc);
                    adminLogIn.doOperation();
                    break;
                case 3:
                    System.out.println("Thank you for visiting. See you soon!");
                    sc.close();
                    runner=false;
                    return;
                default:
                    System.out.println("Invalid option! Please choose the correct option!");
            }
        }
    }

}
