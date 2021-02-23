package game.model;
public class Inventory {
	//Basic items
	public boolean Flashlight;
	public boolean Lighter;
	public boolean Empty = true;
	
	//Complex items
	ComplexItem Gun = new ComplexItem(0,-25,100,false);
	ComplexItem Knife = new ComplexItem(0,-10,100,false);
	ComplexItem Salt = new ComplexItem(0,-10,100,false);
	ComplexItem ReligiousBook = new ComplexItem(0,-25,100,false);
	ComplexItem Ammo = new ComplexItem(0,0,200,false);
	ComplexItem Medicine = new ComplexItem(0,25,200,false);
	ComplexItem FingerGun = new ComplexItem(0,-1000,-100000000,false);
	
	//Score Items
	ScoreItem GoldenIdol = new ScoreItem("GoldenIdol", 1000, false);
	
	//keys
	Key K1 = new Key(0,false,"Master Bedroom Key");
	Key K2 = new Key(1,false,"Green House Key");
	Key K3 = new Key(2,false,"Office Key");
	Key K4 = new Key(3,false,"Study Key");
	Key K5 = new Key(4,false,"Attic Room Key");
	Key K6 = new Key(5,false,"Antiques Room Key");
	
	//Complex Monster Item
	ComplexItem GhostAttack = new ComplexItem(0,-10,0,false);
	ComplexItem FigureAttack = new ComplexItem(0,-10,0,false);
	
	//Inventory constructor
	Inventory(boolean FL, boolean LR){
	
	Flashlight = FL;
	Lighter = LR;
	}
	
	//Sets
	public void setFlashLight(boolean FL) {
		Flashlight = FL;
	}
	public void setLighter(boolean LR) {
		Lighter = LR;
	}
	public void setEmpty(boolean MT) {
		Empty = MT;
	}
	
	//Gets
	public boolean getFlashlight() {
		return Flashlight;
	}
	public boolean getLighter() {
		return Lighter;
	}
	public boolean getEmpty() {
		return Empty;
	}
	
	//Says
	public void sayInventory() {
		System.out.println("you have: ");
		
		if(Flashlight) {
			System.out.println("A Flashlight");
			Empty = false;
		}
		if(Lighter) {
			System.out.println("A lighter");
			Empty = false;
		}
		if(Gun.getQuantity()>=1){
			System.out.println("A Handgun");
			Empty = false;
		}
		if(Knife.getQuantity()>=1){
			System.out.println("A knife");
			Empty = false;
		}
		if(Salt.getQuantity()>=1){
			System.out.println("Salt");
			Empty = false;
		}
		if(ReligiousBook.getQuantity()>=1){
			System.out.println("A Religious book");
			Empty = false;
		}
		if(FingerGun.getQuantity()>=1){
			System.out.println("Two Finger Guns");
			Empty = false;
		}
		if(Ammo.getQuantity()>=1){
			System.out.println(Ammo.getQuantity()+" rounds of Handgun ammo");
			Empty = false;
		}
		if(K1.getInInventory() == true){
			System.out.println(K1.getKeyName());
			Empty = false;
		}
		if(K2.getInInventory() == true){
			System.out.println(K2.getKeyName());
			Empty = false;
		}
		if(K3.getInInventory() == true){
			System.out.println(K3.getKeyName());
			Empty = false;
		}
		if(K4.getInInventory() == true){
			System.out.println(K4.getKeyName());
			Empty = false;
		}
		if(K5.getInInventory() == true){
			System.out.println(K5.getKeyName());
			Empty = false;
		}
		if(K6.getInInventory() == true){
			System.out.println(K6.getKeyName());
			Empty = false;
		}
		if(Medicine.getQuantity()>=1){
			System.out.println(Medicine.getQuantity()+" medical supplies");
			Empty = false;
			
		}
		if(Empty == true) {
			System.out.println("no items.");
		}
	}
}
