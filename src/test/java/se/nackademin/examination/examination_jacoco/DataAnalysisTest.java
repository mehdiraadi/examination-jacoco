package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {
	DataAnalysis dataAnalysis = new DataAnalysis();

	@Test
	public void testBuildFinalStringTest1() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}
	@Test
	public void testBuildFinalStringTest2(){
		ArrayList<String> values= new ArrayList<String>();
		values.addAll(Arrays.asList("Guess", "Jasmi","Shaheer","F","29","Clt"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
				result.contains("The name of the homecity is small and the participant is younger than 30"));
	}
	@Test
	public void testGetResultStringNameAndAge1(){
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Guess", "Jasmi","Shaheer","F","29","Clt"));
		String output=dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger'" ,
				output.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
	}
	@Test
	public void testGetResultStringNameAndAge2(){
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Guess", "Jasminee","Shaheer","F","31","Clt"));
		String output=dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30'" ,
				output.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
	}
	@Test
	public void testGetResultStringNameAndAge3(){
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Guess", "Jas","Shaheer","F","31","Clt"));
		String output=dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'No analysis was performed'" ,
				output.contains("No analysis was performed"));
	}
		
		
	
	@Test
	public void testGetResultStringHomeCityAndAge1(){
		ArrayList<String> values= new ArrayList<String>();
		values.addAll(Arrays.asList("Guess", "Jasmi","Shaheer","F","29","Clt"));
		String output=dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30'",
				output.contains("The name of the homecity is small and the participant is younger than 30"));
			}
	@Test
	public void testGetResultStringHomeCityAndAge2(){
		ArrayList<String> values= new ArrayList<String>();
		values.addAll(Arrays.asList("Guess", "Jasmi","Shaheer","F","30","Kozhikode"));
		String output=dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older'",
				output.contains("The name of the homecity is big and the participant is 30 or older"));
			}
	@Test
	public void testGetResultStringHomeCityAndAge3(){
		ArrayList<String> values= new ArrayList<String>();
		values.addAll(Arrays.asList("Guess", "Jasmi","Shaheer","F","29","clt"));
		String output=dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30'",
				output.contains("The name of the homecity is small and the participant is younger than 30"));
	}
	
	@Test
	public void testGetResultStringHomeCityAndAge4(){
		ArrayList<String> values= new ArrayList<String>();
		values.addAll(Arrays.asList("Guess", "Jasmi","Shaheer","F","25","Kozhikode"));
		String output=dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is younger than 30'",
				output.contains("The name of the homecity is big and the participant is younger than 30"));
	}
	@Test
	public void testGetResultStringHomeCityAndAge5(){
		ArrayList<String> values= new ArrayList<String>();
		values.addAll(Arrays.asList("Guess", "Jasmi","Shaheer","F","30","clt"));
		String output=dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is 30 or older'",
				output.contains("The name of the homecity is small and the participant is 30 or older"));
	}
	
	
			
		
		
	}


