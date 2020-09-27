package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		//Declared using literal String
		String str1 = "Welcome" ;  //index starts from 0 and last index length()-1
		
		
		System.out.println(str1.substring(2));
		
		
		//endIndex-1
		System.out.println(str1.substring(2, 6));
		
		
		/*
		 * String replace = str1.replace('e', '$');
		 * 
		 * String replaceAll = str1.replaceAll("the", "a");
		 * 
		 * System.out.println(replaceAll);
		 */
		
		
		/*
		 * String[] words = str1.split(" ");
		 * 
		 * System.out.println(words.length);
		 * 
		 * for (String eachWord : words) {
		 * 
		 * System.out.println(eachWord);
		 * 
		 * }
		 */
		
		/*
		 * char[] charArray = str1.toCharArray();
		 * 
		 * for (char ch : charArray) { System.out.println(ch);
		 * 
		 * }
		 */
		
		
		/*
		 * for (int i = str1.length() - 1; i >=0 ; i--) {
		 * 
		 * System.out.print(str1.charAt(i));
		 * 
		 * }
		 */
		
		
		/*
		 * System.out.println(str1.length());
		 * 
		 * System.out.println(str1.charAt(0));
		 * 
		 * System.out.println(str1.charAt(str1.length()-1));
		 */
		/*
		 * String str2 = "welcome" ;
		 * 
		 * //Declare using new keyword String str3 = new String("welcome");
		 * 
		 * System.out.println(str1==str2);
		 * 
		 * System.out.println(str1==str3);
		 * 
		 * System.out.println("************************");
		 * System.out.println(str1.equals(str2));
		 * 
		 * System.out.println(str1.equals(str3));
		 * 
		 * System.out.println(str1.equalsIgnoreCase(str2));
		 */

	}

}
