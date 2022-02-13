package javaproject;

class ApexGame{
	ApexGame() {}
}

//character

class Character extends ApexGame{
	int speed;
	int punchDamage;
	int lifePoint;
	String name;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	Character(int sp, int pD, int lp) {
		this.speed = sp;
		this.punchDamage = pD;
		this.lifePoint = lp;
	}
}


class Detection extends Character {
	Detection(){
		super(45,45,50);
	}
	public String toString() {
		return "Detection";
	}
	public void detect(){
		
	}
}
class Attaction extends Character {
	Attaction(){
		super(45,50,45);
	}
	public String toString() {
		return "Attaction";
	}
}
class Defense extends Character {
	Defense(){
		super(40,45,55);
	}	
	public String toString() {
		return "Defense";
	}
}
class Cure extends Character {
	Cure(){
		super(50,45,45);
	}	
	public String toString() {
		return "Cure";
	}
	public void cure() {
		
	}
	
}
//gun

class Gun extends ApexGame{
	int damage;
	int reloadSpeed;
	
	Gun(int dm, int rSp) {
		this.damage = dm;
		this.reloadSpeed = rSp;
		
	}
}


public class Apex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
