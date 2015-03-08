
public class Coin {
	String sideUp;
	
	public Coin(){
		toss();
	}
	
	public void toss(){
		sideUp = ((int)(Math.random()*2)==1)?"Heads":"Tails";
	}
	
	public String getSideUp(){ return sideUp;}
	public String toString(){return sideUp;}
	
	
}
