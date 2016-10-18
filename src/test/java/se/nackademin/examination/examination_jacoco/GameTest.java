package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {
       Game game=new Game();
	@Test
	public void testCalculateOutputBasedOnName1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testCalculateOutputBasedOnName2() {
		int i=game.calculateOutPutBasedOnNames("Jasmi", "Shaheeer");
		assertEquals("The result should be 0", i, 0);
		
	}
	@Test
	public void testCalculateOutputBasedOnName3() {
		int i=game.calculateOutPutBasedOnNames("Jasmi", "Shahe");
		assertEquals("The result should be 2", i, 2);
	}
	@Test
	public void testCalculateOutputBasedOnAge(){
		int i=game.calculateOutPutBasedOnAge(29);
		assertEquals("The result should be 1",i,1);
	}
	@Test
	public void testCalculateOutputBasedOnGender1(){
		int i=game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1",i,1);
	}
	@Test
	public void testCalculateOutputBasedOnGender2(){
		int i=game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0",i,0);
	}
	@Test
	public void testCalculateOutputBasedOnGender3(){
		int i=game.calculateOutPutBasedOnGender('O');
		assertEquals("The result should be 2",i,2);
	}
	@Test
	public void testGetGenderFromInputValues(){
		ArrayList<String>arrayOfInputs1=new ArrayList<String>();
		arrayOfInputs1.addAll(Arrays.asList("Guess","jasmi","sh","M","20","cl"));
		
		char i=game.getGenderFromInputValues(arrayOfInputs1);
		assertEquals('M',i);
	}
	@Test
	public void testGetAgeFromInputValues(){
		ArrayList<String>arrayOfInputs1=new ArrayList<String>();
		arrayOfInputs1.addAll(Arrays.asList("Guess","jasmi","sh","M","20","cl"));
		
		int i=game.getAgeFromInputValues(arrayOfInputs1);
		assertEquals(20,i);
	}
	@Test
	public void testRun(){
		ArrayList<String>values1=new ArrayList<String>();
		values1.addAll(Arrays.asList("Guess","jasmi","sh","M","20","cl"));
		game.run(values1);
		
	}
	@Test
	public void testCalculateOutputBasedOnHomeCityForCharA(){
		int output=game.calculateOutPutBasedOnHomeCity("a");
		assertEquals(0,output);
	}
	@Test
	public void testCalculateOutputBasedOnHomeCityForCharB(){
		int output=game.calculateOutPutBasedOnHomeCity("b");
		assertEquals(1,output);
	}
	@Test
	public void testCalculateOutputBasedOnHomeCityForCharC(){
		int output=game.calculateOutPutBasedOnHomeCity("c");
		assertEquals(2,output);
	}
	@Test
	public void testCalculateOutputBasedOnHomeCityForCharD(){
		int output=game.calculateOutPutBasedOnHomeCity("d");
		assertEquals(3,output);
	}
	@Test
	public void testCalculateOutputBasedOnHomeCityForCharE(){
		int output=game.calculateOutPutBasedOnHomeCity("e");
		assertEquals(4,output);
	}
	@Test
	public void testCalculateOutputBasedOnHomeCityForCharF(){
		int output=game.calculateOutPutBasedOnHomeCity("f");
		assertEquals(5,output);
	}
	@Test
	public void testCalculateOutputBasedOnHomeCityForCharG(){
		int output=game.calculateOutPutBasedOnHomeCity("g");
		assertEquals(6,output);
	}
	@Test
	public void testCalculateOutputBasedOnHomeCityForCharH(){
		int output=game.calculateOutPutBasedOnHomeCity("h");
		assertEquals(7,output);
	}
	@Test
	public void testCalculateOutputBasedOnHomeCityForCharI(){
		int output=game.calculateOutPutBasedOnHomeCity("i");
		assertEquals(8,output);
	}
	@Test
	public void testCalculateOutputBasedOnHomeCityForCharJ(){
		int output=game.calculateOutPutBasedOnHomeCity("j");
		assertEquals(9,output);
	}
	@Test
	public void testCalculateOutputBasedOnHomeCityForCharK(){
		int output=game.calculateOutPutBasedOnHomeCity("k");
		assertEquals(10,output);
	}

	
		

}
