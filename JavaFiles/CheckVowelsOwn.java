package assignmentJava;
import java.util.Scanner;
public class CheckVowelsOwn {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        boolean hasAllVowels = containsAllVowels(input);

	        if (hasAllVowels) {
	            System.out.println("The string contains all vowels.");
	        } else {
	            System.out.println("The string does not contain all vowels.");
	        }

	        scanner.close();
	    }

	   static boolean containsAllVowels(String str) {
	        str = str.toLowerCase();
	        boolean hasA = false, hasE = false, hasI = false, hasO = false, hasU = false;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a') {
	                hasA = true;
	            } else if (ch == 'e') {
	                hasE = true;
	            } else if (ch == 'i') {
	                hasI = true;
	            } else if (ch == 'o') {
	                hasO = true;
	            } else if (ch == 'u') {
	                hasU = true;
	            }
	        }

	        return hasA && hasE && hasI && hasO && hasU;
	    }
	}


