
public class Inventory
{
    public boolean FLASHLIGHT = false;
    public boolean KNIFE = false;
    public boolean GUN = false;
    public boolean MATCHES = false;
    public boolean MEDICINE = false;
    public boolean SALT = false;
    public boolean RELIGIOUSBOOK = false;
    public int AMMO = 0;
    public int GODAMMO = 1000;
    public boolean GODMODEON = false;
    
    public boolean FLASHLIGHTBKUP = false;
    public boolean KNIFEBKUP = false;
    public boolean GUNBKUP = false;
    public boolean MATCHESBKUP = false;
    public boolean MEDICINEBKUP = false;
    public boolean SALTBKUP = false;
    public boolean RELIGIOUSBOOKBKUP = false;
    public int AMMOBKUP = 0;
    
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
    //get inventory
        public void getInventory(){
            if(FLASHLIGHT == true){
                System.out.println("You have an old flashlight...\n");
            }
            if(KNIFE == true){
                System.out.println("You have a kitchen knife...\n");
            }
            if(GUN == true){
                System.out.println("You have an old .38 revolver...\n");
            }
            if(MATCHES == true){
                System.out.println("You have a box of matches...\n");
            }
            if(MEDICINE == true){
                System.out.println("You have some medicine...\n");
            }
            if(SALT == true){
                System.out.println("You have a jar of salt...\n");
            }
            if(RELIGIOUSBOOK == true){
                System.out.println("You have an old leather book...\n");
            }
            if(AMMO >= 1){
                System.out.println("You have " + AMMO +" rounds of .38 special...\n");
            }
            else{
                System.out.println("Your pockets are empty...\n");
            }
            
        }
    //Cheats
        public void backupInventoryForCheatsOff(){
                FLASHLIGHTBKUP = FLASHLIGHT;
                KNIFEBKUP = KNIFE;
                GUNBKUP = GUN;
                MATCHESBKUP = MATCHES;
                MEDICINEBKUP = MEDICINE;
                SALTBKUP = SALT;
                RELIGIOUSBOOKBKUP = RELIGIOUSBOOK;
                AMMOBKUP =AMMO ;
        }
        public void godModeOn(boolean godModeOn){
                this.backupInventoryForCheatsOff();
                if(GODMODEON == false){
                    FLASHLIGHT = godModeOn;
                    KNIFE = godModeOn;
                    GUN = godModeOn;
                    MATCHES = godModeOn;
                    MEDICINE = godModeOn;
                    SALT = godModeOn;
                    RELIGIOUSBOOK = godModeOn;
                    AMMO = GODAMMO;
                    GODMODEON = true;
            }   if(GODMODEON == true){
                System.out.println("godmode is already on");
            }
        }
        public void godModeOff(){
                GODMODEON = false;
                FLASHLIGHT = FLASHLIGHTBKUP;
                KNIFE = KNIFEBKUP;
                GUN = GUNBKUP;
                MATCHES = MATCHESBKUP;
                MEDICINE = MEDICINEBKUP;
                SALT = SALTBKUP;
                RELIGIOUSBOOK = RELIGIOUSBOOKBKUP;
                AMMO = AMMOBKUP;
        }        
        
}
