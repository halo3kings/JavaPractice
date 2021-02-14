
public class Search extends RoomPopulator
{
    public int ROOMNUMBER = 0;
    
    public void setRoomLetter(int rl){
        ROOMNUMBER = rl;
    }
    public void getRoomContents(){
        if(ROOMNUMBER == 0){
            getPorchData();
            porch.setROOMSEARCHED(true);
        }
        if(ROOMNUMBER == 1){
            getGarageData();
            garage.setROOMSEARCHED(true);
        }
        if(ROOMNUMBER == 2){
            getHallData();
            hall.setROOMSEARCHED(true);
        }
        if(ROOMNUMBER == 3){
            getLibraryData();
            library.setROOMSEARCHED(true);
        }
        if(ROOMNUMBER == 4){
            getLoungeData();
            lounge.setROOMSEARCHED(true);
        }
        if(ROOMNUMBER == 5){
            getPoolHallData();
            poolHall.setROOMSEARCHED(true);
        }
        if(ROOMNUMBER == 6){
            getDiningRoomData();
            diningRoom.setROOMSEARCHED(true);
        }
        if(ROOMNUMBER == 7){
            getKitchenData();
            kitchen.setROOMSEARCHED(true);
        }
        if(ROOMNUMBER == 8){
            getGreenHouseData();
            greenHouse.setROOMSEARCHED(true);
        }
        if(ROOMNUMBER == 9){
            getFloor2Data();
            floor2.setROOMSEARCHED(true);
        }        
    }
}
