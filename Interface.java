package sample.java;

interface Batsmen {
	int x = 3;
    void runs();
    }
interface Bowlers {
	int y = 8;
	void overs();
}
class Team implements Batsmen,Bowlers {
	public void runs () {
		System.out.println("runs is : " + 11450);
	}
	public void overs () {
		System.out.println("overs is : " + 782);
	}
		
	}

public class Interface {
	 public static void main(String[] args) {
		Team cric = new Team();
		cric.runs();
		cric.overs();
		System.out.println("batsman num is : " + Batsmen.x);
		System.out.println("bowler num is : " + Bowlers.y);
	}

}
