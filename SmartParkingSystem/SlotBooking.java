package SmartParkingSystem;

import java.util.Scanner;

public class SlotBooking
{
    private Scanner sc;
    private String mallName;
    private int slotNo;
    private static Mall mall = new Mall();

    public SlotBooking(Scanner sc) {this.sc = sc;}

    public void doBooking()
    {
        System.out.println("Enter the Mall name : ");
        mallName = sc.nextLine();
        boolean[] available = mall.isMallAvailable(mallName);
        slotNo = -1;

        if (available != null)
        {
            for (int i = 0; i < available.length; i++)
            {
                if (!available[i])
                {  // If slot is free, book it
                    available[i] = true;
                    slotNo = i + 1;
                    break;
                }
            }
        }

        if (slotNo != -1)
        {
            Vehicles vh = new Vehicles();
            vh.setSlotNo(slotNo);
            System.out.println("Enter the Vehicle No :");
            String vhNo = sc.nextLine();
            vh.setVehicleNo(vhNo);
            System.out.println("Enter the owner name : ");
            String ownerName = sc.nextLine();
            vh.setOwnerName(ownerName);
            System.out.println("Booking Successful in " + mallName + ", Slot " + slotNo);
        }
        else
        {
            System.out.println("Sorry! No slots are available.");
        }
    }

    public void checkoutVehicle()
    {
        System.out.println("Enter the Mall name: ");
        mallName = sc.nextLine();
        System.out.println("Enter the slot number to checkout: ");
        slotNo = sc.nextInt();
        sc.nextLine(); // Clear buffer

        boolean[] available = mall.isMallAvailable(mallName);
        if (available != null && slotNo > 0 && slotNo <= available.length)
        {
            if (available[slotNo - 1])
            {
                available[slotNo - 1] = false; // Mark slot as free
                System.out.println("Vehicle has exited. Slot " + slotNo + " is now available.");
            }
            else
            {
                System.out.println("Slot is already empty!");
            }
        }
        else
        {
            System.out.println("Invalid slot number!");
        }
    }
}
