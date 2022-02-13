package dayWeb5;

interface Assist{}
interface Rebound{}
interface ThreePoint{
	void Three(int shoot);//컬러
}
interface Block{}

class BasketPlayer{
	//int shoot = 20;
	int goal;
	final int FG;
	
	BasketPlayer(int goal){
		FG = goal;
	}
}

class Guard extends BasketPlayer{
	Guard(int goal){
		super(goal);
	}
}

class Forward extends BasketPlayer{
	Forward(int goal){
		super(goal);
	}
}

class StephenCurry extends Guard implements ThreePoint{
	StephenCurry(int goal){
		super(goal);
	}
	
	public void Three(int goal) {
		int thr = goal*3; 
		System.out.println("3점만 "+ thr + "점을 넣었습니다.");
	}
	
	
}

public class Basketball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StephenCurry curry = new StephenCurry(13);
		
		curry.Three(5);
	}

}
