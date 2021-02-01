package test;

import static org.junit.jupiter.api.Assertions.*;
import aggregation.Ball;

import org.junit.jupiter.api.Test;

import aggregation.Ball;

class testBall {

	@Test
	void testBallCons() {
		Ball b = new Ball ("Red", 4);
		String color=b.getColor();
		assertEquals("Red", color);
		assertEquals(4, b.getSize());
	}
	@Test
	void testtoString() {
		Ball b = new Ball ("Red", 4);
		String expected = "The color is:Red,The size is:4";
		String actual = b.toString();
		System.out.println(expected);
		System.out.println(actual);
		assertEquals(expected, actual);
	}

}
