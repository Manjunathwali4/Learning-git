package com.Training.Challenge;

public class ChallengeOne {
	
	public static String getDurationString(int minutes, int seconds) {
        String string = "";
        int secondsSum = minutes * 60 + seconds;
        if (minutes >= 0 && seconds >= 0 && seconds <=59) {
            string = ((int) (secondsSum / 3600) + "h " + ((secondsSum % 3600) / 60) + "m " + (secondsSum % 60) + "s");
        } else {
           return "Invalid value";
        }
        return string;
    }

    public static String getDurationString(int seconds) {
        String string = "";
        if (seconds >= 0) {
            string = getDurationString(seconds/60, seconds % 60);
        }else {
        	return "Invalid value";
        }
        return string;
    }
	
}

































/* Challenges:
1. Create a method called getDurationString with two oarameters, first parameter minutes and 2nd parameters seconds.
 - You should validate the first parameter minutes is >=0
 - you should also validate that the 2nd parameter seconds is >=0 and <=59.
 - The methods should return "invalid value" in the method if wither of the above are not true.
 -if the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as String in format "XXh YYm ZZs" where XX represents a number of hours, YY the minutes and ZZ the seconds.
 - Create a 2nd method if the same name but with only one parameter seconds.
 - validate that it is >=0, and return "invalid value " if it is not true.

- If it is valid then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
- call both methods to print values to the console.
*/












