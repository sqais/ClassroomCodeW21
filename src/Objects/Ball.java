package Objects;

public class Ball {
	private String color;
	private int size;
	
	public Ball(String c, int s) {
		color=c;
		size=s;
	}
	
	public void bounce(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Bounce");
		}
	}
	public String getColor(){
		return color;
	}
	public void setColor(String c){
		color=c;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int s) {
		if(s<0)
			System.out.print("Size should be positive");
		else
			size=s;
	}
}
