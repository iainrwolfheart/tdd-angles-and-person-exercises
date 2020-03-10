package angles;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	Person fred1;
	Person fred2;
	Person bill;
	Person jane;
	List<Person> people = new ArrayList<Person>();

	@Before
	public void setUp() throws Exception {
		fred1 = new Person("Fred", "Foggs", 29, "FF29");
		fred2 = new Person("Fred", "Foggs", 29, "FF29");
		bill = new Person("Bill", "Boggs", 31, "BB31");
		jane = new Person("Jane", "Joggs", 29, "JJ29");
		
		people.add(bill);
		people.add(jane);
		people.add(fred1);
		people.add(fred2);
	}

	@Test
	public void test() {
		assertTrue(fred1.equals(fred2));
		assertFalse("We're not the same, dear", fred1.equals(bill));
		assertFalse("We're not the same, dear", fred2.equals(bill));
		assertFalse("We're not the same, dear", bill.equals(jane));
		assertFalse("We're not the same, dear", fred1.equals(jane));
		assertFalse("We're not the same, dear", fred2.equals(jane));	
	}
	
	@Test
	public void testListContents() {
		assertTrue("Fred exists!", people.contains(fred1));
	}
	
	@Test
	public void testInstancesAreEqual() {
		//checks for reference equality and therefore fails
		assertEquals(fred1, fred2);
	}
	
	@Test
	public void testObjectsAreEqual() {
		Object o1 = fred1;
		Object o2 = fred2;
		
		assertTrue(o1.equals(o2));
		assertEquals(o1, o2);
	}
	
	
	
	
}
