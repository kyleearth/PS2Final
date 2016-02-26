package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		assertTrue(MyInteger.isEven(2) == true);
		assertTrue(MyInteger.isEven(100) == true);
		assertTrue(MyInteger.isEven(1) == false);
		assertFalse(MyInteger.isEven(10) == false);
		assertFalse(MyInteger.isEven(3) == true);
		assertFalse(MyInteger.isEven(1) == true);

		assertTrue(MyInteger.isOdd(0) == false);
		assertTrue(MyInteger.isOdd(1) == true);
		assertFalse(MyInteger.isOdd(2) == true);
		assertFalse(MyInteger.isOdd(3) == false);

		assertTrue(MyInteger.isPrime(1) == true);
		assertTrue(MyInteger.isPrime(3) == true);
		assertTrue(MyInteger.isPrime(17) == true);
		assertTrue(MyInteger.isPrime(99) == false);
		assertTrue(MyInteger.isPrime(4) == false);
		assertTrue(MyInteger.isPrime(49) == false);
		assertFalse(MyInteger.isPrime(0) == true);
		assertFalse(MyInteger.isPrime(11) == false);

	}

	

}
