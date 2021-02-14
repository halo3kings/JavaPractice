
public class RoomPopulator
{
    int CURRENTROOMNUMBER;
    int numberOfRooms = 10;
    Room[] RM = new Room[numberOfRooms];
    public void fillRooms(){
        RM[0] = new Room(true,true,true, true,true,true,10,100,0,"The Dev Room",100,100,100,100,false,false,false,1);
        RM[1] = new Room(false,false,false,false,false,false,0,0,0,"The Front Porch",2,0,1,0,false,false,false,0);//Porch
        RM[2] = new Room(false,false,false,false,false,false,0,0,1,"The Garage",0,0,0,0,false,false,false,0);//Hall   
    }
    public void setNumberOfRooms(int NOR){
        numberOfRooms = NOR;   
    }
    public void setCurrentRoomNumber(int RN){
        CURRENTROOMNUMBER = RN;
    }
    public int getCurrentRoomNumber(){
        return CURRENTROOMNUMBER;
    }
}
