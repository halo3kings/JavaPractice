
public class Status
{
    int HEALTHPOINTS;
    int SANITY;
    Status(int HP, int SY){
        this.HEALTHPOINTS = HP;
        this.SANITY = SY;
    }
    //get
    public void getStatus(){
        System.out.println("HP: "+ HEALTHPOINTS);
        System.out.println("Sanity: "+ SANITY);
    }
    public int getHp(){
        return HEALTHPOINTS;
    }
    public int getSanity(){
        return SANITY;
    }    
    //set
    public void setHp(int hp){
        HEALTHPOINTS = HEALTHPOINTS + hp;   
    }
    public void setSanity(int sy){
        SANITY = SANITY + sy;   
    }
}

