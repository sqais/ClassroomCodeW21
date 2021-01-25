package Objects;
import java.util.ArrayList;
enum Color 
{ 
 RED, GREEN, BLUE,BLACK; 
} 
public class MainBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ball>balls=new ArrayList<Ball>();
		int a[]= {1,2,3};
		Ball redball=new Ball(Color.BLUE,2);
		Ball blueball=new Ball(Color.RED,3);
		//redball.color="Red";
		System.out.println(redball.getSize());
		//redball.setSize(2);
		redball.bounce(3);
		//blueball.setColor("Blue");
		//blueball.setSize(-3);
		//blueball.bounce(4);
		//System.out.println(blueball.getColor());
		changeBall(blueball);
		System.out.println(blueball.getSize());
		System.out.println(blueball.getColor());
		String b="10";
		System.out.println("a="+a[0]);
		printa(a);
		System.out.println("a="+a[0]);
		Ball redball2=new Ball(redball);
		System.out.println(redball2.getSize());
		System.out.println(redball2.getColor());
		
		balls.add(redball);
		balls.add(blueball);
		balls.add(redball2);
		
		for(Ball ball: balls) {
			
			System.out.println(ball.getColor());
		}
		
		
	}
	public static void printa(int a[]) {
		a[0]=50;
		System.out.println("Value for a is="+a[0]);
	}
	public static void changeBall(Ball b) {
		System.out.println("inside method");
		b.setColor(Color.GREEN);
		b.setSize(10);
		System.out.println(b.getSize());
		System.out.println(b.getColor());
		
	}

}
