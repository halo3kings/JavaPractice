
public class Inventory
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

    Inventory (boolean FL, boolean KF, boolean GN, boolean LT, boolean ST, boolean RB, int MD, int AO){
        this.FLASHLIGHT = FL;
        this.KNIFE = KF;
        this.GUN = GN;
        this.LIGHTER = LT;
        this.SALT = ST;
        this.RELIGIOUSBOOK = RB;
        this.MEDICINE = MD;
        this.AMMO = AO;        
    }
    //set
    public void setFl(boolean fl){
        FLASHLIGHT = fl;
    }
    public void setKF(boolean kf){
        KNIFE = kf;
    }
    public void setGN(boolean gn){
        GUN = gn;
    }
    public void setLT(boolean lt){
        LIGHTER = lt;
    }
    public void setST(boolean st){
        SALT = st;
    }
    public void setRB(boolean rb){
        RELIGIOUSBOOK = rb;
    }
    public void setMD(int md){
        MEDICINE = MEDICINE + md;
    }
    public void setAO(int ao){
        AMMO = ao;
    }
    //gets
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
    public void getInventory(){
        if(FLASHLIGHT == true){
            System.out.println("You have a Flashlight");
        }
        if(KNIFE == true){
            System.out.println("You have a Knife");
        }
        if(LIGHTER == true){
            System.out.println("You have a Lighter");
        }
        if(GUN == true){
            System.out.println("You have a Gun");
        }
        if(SALT == true){
            System.out.println("You have some Salt");
        }
        if(RELIGIOUSBOOK == true){
            System.out.println("You have a Religious book");
        }
        if(MEDICINE > 0){
            System.out.println("You have: "+MEDICINE+ " Medicine");
        }
        if(AMMO > 0){
            System.out.println("You have: "+AMMO+" Ammo");
        }
        else{
            System.out.println("You have no items");
        }
    }
}
