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
}
