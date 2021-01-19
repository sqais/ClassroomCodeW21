package Objects;

public class MainBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball redball=new Ball("Red",2);
		Ball blueball=new Ball("Blue",3);
		//redball.color="Red";
		System.out.println(redball.getSize());
		//redball.setSize(2);
		redball.bounce(3);
		//blueball.setColor("Blue");
		//blueball.setSize(-3);
		blueball.bounce(4);
		System.out.println(blueball.getColor());
		

	}

}
