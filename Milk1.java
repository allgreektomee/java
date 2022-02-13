package test;

class Milk {
	String name;
	
	Milk(){}
	Milk(String name){
		this.name = name;
	}
}
class ChocoMilk extends Milk{
	String taste;
	
	ChocoMilk(String name, String taste){
		super(name);
		this.taste = taste;
	}
	void taste() {
		System.out.println("ÀÌ¸§ : " +name + " ¸À : " +taste);
	}
	
}
class WhiteMilk extends Milk{
	String taste;
	
	WhiteMilk(String name, String taste){
		super(name);
		this.taste = taste;
	}
	void taste() {
		System.out.println("ÀÌ¸§ : " +name + " ¸À : " +taste);
	}
}
class BananaMilk extends Milk{
	String taste;
	
	BananaMilk(String name, String taste){
		super(name);
		this.taste = taste;
	}
	void taste() {
		System.out.println("ÀÌ¸§ : " +name + " ¸À : " +taste);
	}
}
class StrawberryMilk extends Milk{
	String taste;
	
	StrawberryMilk(String name, String taste){
		super(name);
		this.taste = taste;
	}
	void taste() {
		System.out.println("ÀÌ¸§ : " +name + " ¸À : " +taste);
	}
}

public class Milk1 {
	public static void main(String[] args) {
		ChocoMilk choco = new ChocoMilk("ÃÊÄÚ¿ìÀ¯", "ÃÊÄÚ¿ìÀ¯¸À");
		choco.taste();
		WhiteMilk white = new WhiteMilk("Èò¿ìÀ¯", "Èò¿ìÀ¯¸À");
		white.taste();
		BananaMilk banana = new BananaMilk("¹Ù³ª³ª¿ìÀ¯", "¹Ù³ª³ª¿ìÀ¯¸À");
		banana.taste();
		StrawberryMilk strawberry = new StrawberryMilk("µş±â¸À", "µş±â¿ìÀ¯¸À");
		strawberry.taste();
	}

}
