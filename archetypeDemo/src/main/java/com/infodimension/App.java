package com.infodimension;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
	private String id;
	private Date startDate;
	private String desc;
	
    public static void main( String[] args ) 
    {
    	App app = new App();
    	String upper = app.upperCase("Hello World!");
        System.out.println( "upper = " + upper );
        
        app.loop();
        
        ////String badString = "a" + "b" + "c";
    }
    
    protected String upperCase(String str) {
    	
    	String upper = str.toUpperCase();
    	return upper;
    }

    protected void loop() {
    	
    	for(int i = 0; i < 100000; i++) {
    		
    		System.out.println("i = " + i);
    	}
    	
    	this.finishMe();
    }
    
    protected void finishMe() {
    	
    	//finish
    }
    
    protected void npe() {
    	
    	String a = null;
    	
    	a.charAt(0);
    }
}
