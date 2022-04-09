 package Midterm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcateTest {

	@Test
	 public void Concattest() {
		MyJunitClass junit = new MyJunitClass();
		String  result = junit.concat("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
