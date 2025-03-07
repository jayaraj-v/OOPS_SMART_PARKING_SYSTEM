package SmartParkingSystem;

public class Vehicles
{
    private String vehicleNo;
    private int SlotNo;
    private String ownerName;
    private boolean alloted;

    public void setVehicleNo(String vehicleNo) {this.vehicleNo = vehicleNo;}
    public void setSlotNo(int slotNo) {SlotNo = slotNo;}
    public void setOwnerName(String ownerName) {this.ownerName = ownerName;}
    public void setAlloted(boolean alloted) {this.alloted = alloted;}


    public String getVehicleNo() {return vehicleNo;}
    public int getSlotNo() {return SlotNo;}
    public String getOwnerName() {return ownerName;}
    public boolean isAlloted() {return alloted;}


}
