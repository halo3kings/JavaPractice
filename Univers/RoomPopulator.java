
public class RoomPopulator
{
    //public int[] ROOMCONNECTIONS = {0,1,2,3,4,5,6,7,8,9,10};
    //First floor
    Room porch = new Room();
    Room garage = new Room();
    Room hall = new Room();
    Room library = new Room();
    Room lounge = new Room();
    Room poolHall = new Room();
    Room diningRoom = new Room();
    Room kitchen = new Room();
    Room greenHouse = new Room();
    //second floor
    Room floor2 = new Room();
    
    //Porch Data
    public void setPorchData(){
        Room porch = new Room();
        porch.setROOMNUM(0);
        porch.setCONNECTEDROOMS0(1);
        porch.setCONNECTEDROOMS1(2);
    }
    public void setGarageData(){
        Room garage = new Room();
        garage.setROOMNUM(1);
        garage.setFLASHLIGHT(true);
        garage.setCONNECTEDROOMS0(0);
    }
    public void setHallData(){
        Room hall = new Room();
        hall.setROOMNUM(2);
        hall.setCONNECTEDROOMS0(3);
        hall.setCONNECTEDROOMS1(4);
        hall.setCONNECTEDROOMS2(5);
        hall.setCONNECTEDROOMS3(6);
        hall.setCONNECTEDROOMS4(7);
        hall.setCONNECTEDROOMS5(9);
    } 
    public void setlibraryData(){
        Room library = new Room();
        library.setROOMNUM(3);
        library.setRELIGIOUSBOOK(true);
    }
    public void setloungeData(){
        Room lounge = new Room();
        lounge.setROOMNUM(4);
    }
    public void setPoolHallData(){
        Room poolHall = new Room();
        poolHall.setROOMNUM(5);
    }
    public void setDiningRoomData(){
        Room diningRoom = new Room();
        diningRoom.setROOMNUM(6);
        diningRoom.setSALT(true);
    }
    public void setKitchenData(){
        Room kitchen = new Room();
        kitchen.setROOMNUM(7);
        kitchen.setKNIFE(true);
        kitchen.setMEDICINE(true);
    }
    public void setGreenHouseData(){
        Room greenHouse = new Room();
        greenHouse.setROOMNUM(8);
    }
    public void setfloor2Data(){
        Room floor2 = new Room();
        floor2.setROOMNUM(9);
    }
    //get room data
    //porch
    public int getPorchDataRoomNumber(int porchRoomNumber){
        porchRoomNumber = porch.getROOMNUM();
        return porchRoomNumber;
    }
    public int getPorchDataConnectedRooms0(int ConnectedRoom0){
        ConnectedRoom0 = porch.getCONNECTEDROOMS0();
        return ConnectedRoom0;
    }
    
    //Search return 
    public void getPorchData(){
        System.out.println("Theres nothing here");
    }
    public void getGarageData(){
        System.out.println("Theres an old flashlight here");
    }
    public void getHallData(){
        System.out.println("Theres nothing here");
    }
    public void getLibraryData(){
        System.out.println("Theres an old leather book here");
    }
    public void getLoungeData(){
        System.out.println("Theres nothing here");
    }
    public void getPoolHallData(){
        System.out.println("Theres nothing here");
    }
    public void getDiningRoomData(){
        System.out.println("Theres a jar of salt here");
    }
    public void getKitchenData(){
        System.out.println("Theres a kitchen knife and some medicine here");
    }
    public void getGreenHouseData(){
        System.out.println("Theres nothing here");
    }
    public void getFloor2Data(){
        System.out.println("Theres nothing here");
    }
                    
}
