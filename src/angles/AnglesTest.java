package angles;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AnglesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAngleConstructor() {
		Angles angle = new Angles(34);
		
		assertEquals("They aren't equal", 34, angle.getDegrees());
	}
	
	@Test
	public void testNegativeParameter() {
		Angles angle = new Angles(-4);
		
		assertEquals("They aren't equal", 356, angle.getDegrees());
	}
	
	@Test
	public void testParameterLessThenNegativeThreeSixty() {
		Angles angle = new Angles(-370);
		assertEquals("They aren't equal", 350, angle.getDegrees());
	}
	
	@Test 
	public void testTooLargeParameter() {
		Angles angle = new Angles(370);
		assertEquals("They aren't equal", 10, angle.getDegrees());
		
	}
	
	@Test 
	public void testParameterGreaterThanSevenTwenty() {
		Angles angle = new Angles(740);
		assertEquals("They aren't equal", 20, angle.getDegrees());
	}

}
