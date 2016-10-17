package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {
	ResultFromInputs rfi = new ResultFromInputs();
	

	@Test
	public void testNameGettersAndSettersMethods() {
		
		rfi.setResultForNameLenght(10);
		assertEquals("The result should be 10", rfi.getResultForNameLenght(), 10);
	}
	@Test
	public void testAgeGettersAndSettersMethods() {
		
		rfi.setResultForAge(29);
		assertEquals("The result should be 29",rfi.getResultForAge(),29);
		
		
	}
	@Test
	public void testGenderGettersAndSettersMethods() {
		
		rfi.setResultForGender('F');
		assertEquals("The result should be F",rfi.getResultForGender(),'F');
		
		
	}
	@Test
	public void testHomeCityGettersAndSettersMethods() {
		
		rfi.setResultForHomeCity('C');
		assertEquals("The result should be C",rfi.getResultForHomeCity(),'C');
		
		
	}

}
