package test;

interface Repairable {}
interface Healing {}

class Unit {
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;
	}
}
class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

// Dropship tank Marine

class Dropship extends AirUnit implements Repairable{
	Dropship(int hp){
		super(hp);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship";
	}
}
class Tank extends GroundUnit implements Repairable{
	Tank(int hp){
		super(hp);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}
class Marine extends GroundUnit implements Healing{
	Marine(int hp){
		super(hp);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Marine";
	}
}
class SCV extends GroundUnit{
	SCV(int hp){
		super(hp);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "SCV";
	}
	public void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				/* Unit의 HP를 증가시킨다. */
				u.hitPoint++;
			}
			System.out.println( u.toString() + "의 수리가 끝났습니다.");
		}
	}	
}
class Madic extends GroundUnit{
	Madic(int hp){
		super(hp);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Madic";
	}
	public void heal(Healing h) {
		if (h instanceof Unit) {
			Unit u = (Unit)h;
			while(u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 치료가 끝났습니다.");
		}
	}
}



public class UnitTest {

	public static void main(String[] args) {
		Tank tank = new Tank(150);
		Dropship dropship = new Dropship(200);
		Marine marine = new Marine(100);
		
		SCV scv = new SCV(50);
		
		scv.repair(tank);
		
		Madic madic = new Madic(50);
		madic.heal(marine);

	}
}

