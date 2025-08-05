package com.rohan.college.college;

import rcc.rcc;

public class App 
{
	
    public static void main( String[] args )
    
    {
    	formula ob=new formula();
        System.out.println( "Hello World!" );
    
       
        
        System.out.println("Sum: " +   ob.add(2,3));
        System.out.println("Area of Circle: " +  ob.areaOfCircle(6.3));
        rcc rc=new rcc();
         rc.hii();
    }
}
