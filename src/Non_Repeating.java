/**
 * Project Name:	NonRepeatedChars
 * Project Purpose:	To find the first non repeating char in a string
 * Changelog:		J. Salce 12/18/13
 */

public class Non_Repeating {
	
public static void main(String[] args) {
		
		//String to be evaluated
		String str = "DEFD";
		
		//Instatiate 128 byte count array to hold repeated char
		  int[] count = new int[128];
		  char[] charArr = str.toLowerCase().toCharArray();
		  for (char a : charArr) {
		   count[a]++;
		  }
		  
		  
		  for (char a : charArr) {
			  
		   if (count[a] == 1) {      
		    System.out.println("First Non repeated character is : " + a);
		    break;
		   }
		  }
		 }
}