package aggregation;

public class Ball {
	private String color;
	private int size;
	
	public Ball(String color, int size) {
		
		this.color=color;
		this.size=size;
	}
	public Ball() {
		String color;
		int size;
		this.color="No color set";
		this.size=0;
	}
	
	public void bounce(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Bounce");
		}
	}
	public void bounce(int n, int high) {
		for(int i=0;i<n;i++) {
			System.out.println("bounce "+high);
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
	public String toString() {
		String msg="";
		return ("The color is:"+color+","+"The size is:"+size);
	}
}
