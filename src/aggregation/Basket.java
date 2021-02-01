package aggregation;

import java.util.ArrayList;

public class Basket {
	//An example of aggregation
	private ArrayList<Ball> balls;
	private int size;
	public Basket(int s) {
		balls = new ArrayList<Ball>();
		size=s;
	}
	public void addBal(String color, int size) {
		Ball b1 =new Ball(color,size);
		if (balls.size()==size) {
			System.out.println("Basket is full");
		}
		else {
			balls.add(b1);
		}
	}
	public ArrayList<Ball> getListofBalls(){
		return balls;
	}
	public void printBalls() {
		for(Ball b:balls) {
			System.out.println(b.getColor());
		}
	}

}
