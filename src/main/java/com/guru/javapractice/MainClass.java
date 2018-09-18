package com.guru.javapractice;

/**
 * Hello world!
 *
 */
public class MainClass 
{
	enum Day{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}
	
	
	
	enum Classification{
		a,b,c,d,e
	}
	
    public static void main( String[] args )
    {
//    	System.out.println(new Date().getTime());
//    	System.out.println(new SimpleDateFormat("yyyyMMdd").format(new Date()));
    	
    	int[] a = {1,2,3,4,5,6};
    	
    	for(int i : a){
    		if(i==3){
    			System.out.println("continue");
    			continue;
    		}
    		System.out.println("i = "+i);
    	}
    	
    }
}
