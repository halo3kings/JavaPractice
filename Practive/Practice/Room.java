
public class Room
{    
    //BOOLEAN DATA
    boolean FLASHLIGHT = false;
    boolean KNIFE = false;
    boolean GUN = false;
    boolean LIGHTER = false;
    boolean SALT = false;
    boolean RELIGIOUSBOOK = false;
    //INTEGER DATA
    int MEDICINE = 0;
    int AMMO = 0;
    int ROOMNUM = 0;
    int ENEMYNUM = 0;
    //String Data
    String ROOMNAME = "";
    //room exit booleans
    int CONNECTEDROOMSNORTH = 0;
    int CONNECTEDROOMSSOUTH = 0;    
    int CONNECTEDROOMSEAST = 0;
    int CONNECTEDROOMSWEST = 0;
    //Room States
    boolean ROOMISDARK = false;
    boolean ROOMWASSEARCHED = false;
    boolean ENEMIESINROOM = false;
    Room(boolean FL, boolean KF, boolean GN, boolean LT, boolean ST, boolean RB, int MD, int AO,int RN, String RM, int CRN, int CRS, int CRE, int CRW,boolean RD, boolean RS, boolean ER, int EN){
        this.FLASHLIGHT = FL;
        this.KNIFE = KF;
        this.GUN = GN;
        this.LIGHTER = LT;
        this.SALT = ST;
        this.RELIGIOUSBOOK = RB;
        this.MEDICINE = MD;
        this.AMMO = AO;
        this.ROOMNUM = RN;
        this.ROOMNAME = RM;
        this.CONNECTEDROOMSNORTH = CRN; 
        this.CONNECTEDROOMSSOUTH = CRS;        
        this.CONNECTEDROOMSEAST = CRE;
        this.CONNECTEDROOMSWEST = CRW;
        this.ROOMISDARK = RD;
        this.ROOMWASSEARCHED = RS;
        this.ENEMIESINROOM = ER;
        this.ENEMYNUM = EN;
    }
    //gets
    public String getName(){
        return ROOMNAME;
    }
    public int getNumber(){
        return ROOMNUM;
    }
    public boolean getFl(){
        return FLASHLIGHT;
    }
    public boolean getKF(){
        return KNIFE;
    }
    public boolean getLT(){
        return LIGHTER;
    }
    public boolean getGN(){
        return GUN;
    }
    public boolean getST(){
        return SALT;
    }
    public boolean getRB(){
        return RELIGIOUSBOOK;
    }
    public int getMD(){
        return MEDICINE;
    }
    public int getAO(){
        return AMMO;
    }
    public boolean getRS(){
        return ROOMWASSEARCHED;
    }
    public boolean getenemiesInRoom(){
        return ENEMIESINROOM;
    }
    //sets
    public void setRoomDarkness(boolean RD){
        ROOMISDARK = RD;
    }
    public void setRoomSearch(boolean RS){
        ROOMWASSEARCHED = RS;
    }
    public void setenemiesInRoom(boolean ER){
        ENEMIESINROOM = ER;
    }    
    // || DevRoom.getKF() || DevRoom.getLT() || DevRoom.getGN() || DevRoom.getST() || DevRoom.getRB() || DevRoom.getMD > 0 ||DevRoom.getAO() > 0){
    }

