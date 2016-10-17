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
	
}
