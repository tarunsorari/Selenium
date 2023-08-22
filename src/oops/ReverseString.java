package oops;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Tarun1";
		String reversedStr = "";
		
		for(int i = 0; i<str.length(); i++)
		{
			reversedStr += str.charAt(str.length()-(i+1));
			
		}
			System.out.println(reversedStr);
	}

}
