
public class Status
{

    public int HP = 0;
    public int SANITY = 0;
    
    public void setHP(int hp){
        HP = hp;
    }
    public int getHP(){
        int hp = HP;
        return hp;
    }
    public void getStatus(){
        System.out.println("your HP: " + HP);
        System.out.println("your Sanity: " + SANITY);
    }
    public void setSANITY(int sanity){
        SANITY = sanity;
    }
    public int getSANITY(){
        int sanity = SANITY;
        return sanity;
    }
}