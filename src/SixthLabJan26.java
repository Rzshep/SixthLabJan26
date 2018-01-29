import java.util.Arrays;
import java.util.Scanner;

public class SixthLabJan26 {



			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				String cont = "y";
				
				System.out.println("Welcome to the Pig Latin Translator!");
				System.out.println();
				
				String vowels = "aeiou";
				int i = 0;

				while (cont.equalsIgnoreCase("y")) { // IgnoreCase ignores capitalization
					// your code should start here

					System.out.println("Enter a line to be translated: ");
					String english = scan.nextLine();
					
				
					english = changeTolowerCase(english);
					
					String[] englishArr = changeToArray(english);
					
					checkVowel(vowels, englishArr);
					
					System.out.println("Do you want to continue? y/n");
					cont = scan.nextLine();
					
					
				}
				

				// Let the user know the program has ended
				System.out.println("Goodbye!");
				
				scan.close();
			}
				
			
			public static String changeTolowerCase(String lowerCase) {
				String coolPerson = lowerCase.toLowerCase();
				return coolPerson;
			}
			
		
			
			public static String[] changeToArray(String english) {
				String[] helloArr = english.split(" ");
				return helloArr;
			
			}
			
			public static void checkVowel(String vowels, String[] phrase) {
				for (int i = 0; i < phrase.length; i++) {
					if (vowels.indexOf(phrase[i].charAt(0)) !=-1) {
						
						String testString = Arrays.toString(phrase); // turns the String Array "phrase" into a String called "testString"
						String bracketRemove = testString.replaceAll("\\p{P}",""); // this is how you replace all punctuation marks
						System.out.println(bracketRemove + "way");
				} 
					else {
						String testString = Arrays.toString(phrase); 
						String bracketRemove = testString.replaceAll("\\p{P}",""); 
						char firstChar = bracketRemove.charAt(0); 
	                    bracketRemove = bracketRemove.substring(1);
	                    bracketRemove = bracketRemove + firstChar;
	                    System.out.println(bracketRemove + "ay");
					} 
			
			
			
			}
				
				
}
		


	
			}


