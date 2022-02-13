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
		System.out.println("�̸� : " +name + " �� : " +taste);
	}
	
}
class WhiteMilk extends Milk{
	String taste;
	
	WhiteMilk(String name, String taste){
		super(name);
		this.taste = taste;
	}
	void taste() {
		System.out.println("�̸� : " +name + " �� : " +taste);
	}
}
class BananaMilk extends Milk{
	String taste;
	
	BananaMilk(String name, String taste){
		super(name);
		this.taste = taste;
	}
	void taste() {
		System.out.println("�̸� : " +name + " �� : " +taste);
	}
}
class StrawberryMilk extends Milk{
	String taste;
	
	StrawberryMilk(String name, String taste){
		super(name);
		this.taste = taste;
	}
	void taste() {
		System.out.println("�̸� : " +name + " �� : " +taste);
	}
}

public class Milk1 {
	public static void main(String[] args) {
		ChocoMilk choco = new ChocoMilk("���ڿ���", "���ڿ�����");
		choco.taste();
		WhiteMilk white = new WhiteMilk("�����", "�������");
		white.taste();
		BananaMilk banana = new BananaMilk("�ٳ�������", "�ٳ���������");
		banana.taste();
		StrawberryMilk strawberry = new StrawberryMilk("�����", "���������");
		strawberry.taste();
	}

}
