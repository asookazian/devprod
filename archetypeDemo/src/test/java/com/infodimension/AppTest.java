package com.infodimension;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private static App app;
	
	@BeforeClass  //JUnit 4
	//@BeforeAll  //JUnit 5
	public static void setup() {
		
		app = new App();
	}
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
    	
        assertTrue( true );
    }
    
    @Test
    public void upperCaseTest() {
    	
    	App app = new App();
    	String upper = app.upperCase("test");
    	assertEquals("upper is not 'TEST'", "TEST", upper);
    }
}
