package com.dhiru.codingbatsolutions;

public class SleepIn {

	/**
	 * The parameter weekday is true if it is a weekday, 
	 * and the parameter vacation is true if we are on vacation. 
	 * We sleep in if it is not a weekday or we're on vacation. 
	 * Return true if we sleep in. sleepIn(false, false)  true
	 * sleepIn(true, false)  false
	 * sleepIn(false, true)  true
	 * @param weekday
	 * @param vacation
	 * @return
	 */
	public static void main(String[] args) {
		SleepIn sleepIn = new SleepIn();
		boolean sleep = sleepIn.sleepIn(true,true);
		System.out.println("The out of the result is" +sleep);
		
		String newStr = sleepIn.missingChar("Akanksha",1);
		System.out.println("The new string is :- "+newStr);
		
		System.out.println(sleepIn.backAround("cat"));
	}
	public boolean sleepIn(boolean weekday, boolean vacation) {
		  if(vacation){
		      return true;
		  }else if(weekday){
		      return false;
		  }else{
		      return true;
		  }
	}
	
	/**
	 * Given an int n, return the absolute difference between n and 21, 
	 * except return double the absolute difference if n is over 21. 
	 * diff21(19)  2
	 * diff21(10)  11
	 * diff21(21)  0
	 * @param n
	 * @return
	 */
	public int diff21(int n) {
	    if( n >= 21){
	        return 2*(n-21);
	    }
	    return 21 -n;
	}
	
	/**
	 * Given an int n, return true if it is within 10 of 100 or 200. 
	 * Note: Math.abs(num) computes the absolute value of a number. 
	 * nearHundred(93)  true
	 * nearHundred(90)  true
	 * nearHundred(89)  false
	 * @param n
	 * @return
	 */
	public boolean nearHundred(int n) {
	    if ( (n>= 90 & n <= 110)| (n >= 190 & n<= 210)){
	        return true;
	    }
	    return false;
	}
	
	/**
	 * Given a non-empty string and an int n, 
	 * return a new string where the char at index n has been removed. 
	 * The value of n will be a valid index of a char in 
	 * the original string (i.e. n will be in the range 0..str.length()-1 inclusive). 
	 * missingChar("kitten", 1) "ktten"
	 * missingChar("kitten", 0) "itten"
	 * missingChar("kitten", 4) "kittn"
	 * @param str
	 * @param n
	 * @return
	 */
	public String missingChar(String str, int n) {
		StringBuilder sb = new StringBuilder(str);
		sb.deleteCharAt(n);
	    return sb.toString();
	}
	
	/**
	 * Given a string, take the last char and return 
	 * a new string with the last char added at the front and back, so "cat" yields "tcatt". 
	 * The original string will be length 1 or more. backAround("cat")  "tcatt"
	 * backAround("Hello")  "oHelloo"
	 * backAround("a")  "aaa"
	 * 
	 * @param str
	 * @return
	 */
	public String backAround(String str) {
	    int n = str.length();
	    String str1 = str.substring(n-1, n);
	    str = str1+str+str1;
	    return str;
	}
	
	/**
	 * Given a string, return true if the string starts with "hi" and false otherwise. 
	 * startHi("hi there") true
	 * startHi("hi")  true
	 * startHi("hello hi")  false
	 * @param str
	 * @return
	 */
	public boolean startHi(String str) {
		if (str.startsWith("hi") | str.startsWith("Hi")| str.startsWith("HI")|str.startsWith("hI"))
		   return true;
		return false;
	}


}
