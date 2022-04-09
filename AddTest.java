package Midterm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(100, 200);
		assertEquals(300, result);
		
	}

}
