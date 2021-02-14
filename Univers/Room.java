
public class Room
{
    //Items a room can have 
    public int ROOMNUM = 0;
    public boolean FLASHLIGHT = false;
    public boolean KNIFE = false;
    public boolean GUN = false;
    public boolean MATCHES = false;
    public boolean MEDICINE = false;
    public boolean SALT = false;
    public boolean RELIGIOUSBOOK = false;
    public int AMMO = 0;
    public boolean TEST = true;
    //enemy within the room
    public boolean GHOST = false;
    public boolean FIGURE = false;
    //Room State checks
    public boolean ROOMSEARCHED = false;
    //Connecting rooms
    public int CONNECTEDROOMS0 = 0;
    public int CONNECTEDROOMS1 = 0;
    public int CONNECTEDROOMS2 = 0;
    public int CONNECTEDROOMS3 = 0;
    public int CONNECTEDROOMS4 = 0;
    public int CONNECTEDROOMS5 = 0;
    //Sets
        public void setFLASHLIGHT(boolean flashlight){
            FLASHLIGHT = flashlight;
        }
        public void setKNIFE(boolean knife){
            KNIFE = knife;
        }
        public void setGUN(boolean gun){
            GUN = gun;
        }
        public void setMATCHES(boolean matches){
            MATCHES = matches;
        }
        public void setMEDICINE(boolean medicine){
            MEDICINE = medicine;
        }
        public void setSALT(boolean salt){
            SALT = salt;
        }
        public void setRELIGIOUSBOOK(boolean religiousbook){
            RELIGIOUSBOOK = religiousbook;
        }
        public void setAMMO(int ammo){
            AMMO = ammo;
        }
        public void setROOMNUM(int num){
            ROOMNUM = num;
        }
        public void setROOMSEARCHED(boolean rs){
            ROOMSEARCHED = rs;
        }
        public void setCONNECTEDROOMS0(int cr){
            CONNECTEDROOMS0 = cr;
        }
        public void setCONNECTEDROOMS1(int cr){
            CONNECTEDROOMS1 = cr;
        }
        public void setCONNECTEDROOMS2(int cr){
            CONNECTEDROOMS2 = cr;
        }
        public void setCONNECTEDROOMS3(int cr){
            CONNECTEDROOMS3 = cr;
        }
        public void setCONNECTEDROOMS4(int cr){
            CONNECTEDROOMS4 = cr;
        }
        public void setCONNECTEDROOMS5(int cr){
            CONNECTEDROOMS5 = cr;
        }          
    //sets for enemies
        public void setFIGURE(boolean figure){
            FIGURE = figure;
        }
        public void setGHOST(boolean ghost){
            GHOST = ghost;
        }        
    //gets
        public boolean getFLASHLIGHT(){
            boolean flashlight = FLASHLIGHT;
            return flashlight;
        }
        public boolean getKNIFE(){
            boolean knife = KNIFE;
            return knife;
        }
        public boolean getGUN(){
            boolean gun = GUN;
            return gun;
        }
        public boolean getMATCHES(){
            boolean matches = MATCHES;
            return matches;
        }
        public boolean getMEDICINE(){
            boolean medicine = MEDICINE;
            return medicine;
        }
        public boolean getSALT(){
            boolean salt = SALT;
            return salt;
        }
        public boolean RELIGIOUSBOOK(){
            boolean religiousbook = RELIGIOUSBOOK;
            return religiousbook;
        }
        public int getAMMO(){
            int ammo = AMMO;
            return ammo;
        }
        public int getROOMNUM(){
            int num = ROOMNUM;
            return num;
        }
        public boolean getROOMSEARCHED(){
            boolean rs = ROOMSEARCHED;
            return rs;
        }
        public int getCONNECTEDROOMS0(){
            int cr = CONNECTEDROOMS0;
            return cr;
        }
        public int getCONNECTEDROOMS1(){
            int cr = CONNECTEDROOMS1;
            return cr;
        }
        public int getCONNECTEDROOMS2(){
            int cr = CONNECTEDROOMS2;
            return cr;
        }
        public int getCONNECTEDROOMS3(){
            int cr = CONNECTEDROOMS3;
            return cr;
        }
        public int getCONNECTEDROOMS4(){
            int cr = CONNECTEDROOMS4;
            return cr;
        }
        public int getCONNECTEDROOMS5(){
            int cr = CONNECTEDROOMS5;
            return cr;
        }         
    //gets for enemies    
        public boolean getFIGURE(){
            boolean figure = FIGURE;
            return figure;
        }
        public boolean getGHOST(){
            boolean ghost = GHOST;
            return ghost;
        }        
}
