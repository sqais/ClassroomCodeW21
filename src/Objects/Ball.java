package Objects;

public class Ball {
	private Color color;
	private int size;
	
	public Ball(Color c, int s) {
		color=c;
		size=s;
	}
	//Copy constructor
	public Ball(Ball b) {
		color=b.color;
		size=b.size;
	}
	public void bounce(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Bounce");
		}
	}
	public Color getColor(){
		return color;
	}
	public void setColor(Color c){
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
