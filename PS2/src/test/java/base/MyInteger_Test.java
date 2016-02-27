package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	MyInteger value = new MyInteger(17);
	
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
	public void test_get_iValue() {
		assertEquals(value.getiValue(), 17);
	}
	
	@Test
	public void test_isEven() {
		assertFalse(value.isEven());
	}
	@Test
	public void test_isOdd() {
		assertTrue(value.isOdd());
	}
	@Test
	public void test_isPrime() {
		assertTrue(value.isPrime());
	}
	
	@Test
	public void test_isEven_Static() {
		assertTrue(MyInteger.isEven(2));
		assertFalse(MyInteger.isEven(67));
		assertTrue(MyInteger.isEven(1234));
		assertFalse(MyInteger.isEven(9873));
	}
	
	@Test
	public void test_isOdd_Static(){
		assertFalse(MyInteger.isOdd(26));
		assertTrue(MyInteger.isOdd(111));
		assertFalse(MyInteger.isOdd(62));
		assertTrue(MyInteger.isOdd(34525));
	}
	
	@Test
	public void test_isPrime_Static() {
		assertFalse(MyInteger.isPrime(49));
		assertTrue(MyInteger.isPrime(29));
		assertFalse(MyInteger.isPrime(225));
		assertTrue(MyInteger.isPrime(7));
	}
	
	@Test
	public void test_isEven_MyInt() {
		assertFalse(MyInteger.isEven(value));
	}
	
	@Test
	public void test_isOdd_MyInt() {
		assertTrue(MyInteger.isOdd(value));;
	}
	
	@Test
	public void test_isPrime_MyInt() {
		assertTrue(MyInteger.isPrime(value));
	}
	
	@Test
	public void test_equals() {
		assertTrue(MyInteger.equals(17));
		assertFalse(MyInteger.equals(23));
	}
	
	@Test
	public void test_equals_MyInt() {
		assertTrue(MyInteger.equals(value));
	}
}