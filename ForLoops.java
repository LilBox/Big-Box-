import java.util.Scanner;
/*
 * @Author: Kenny Yang
 */
public class ForLoops {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	
	System.out.print("Input a word and I will do some magic\n");
	String input = in.nextLine();
		for (int i = 0;i < input.length();i++) {
			String sub = input.substring(i,i+1);
			if (sub.equals("a")|| sub.equals("e")||sub.equals("i")||sub.equals("o")||sub.equals("u")) {
				System.out.print("*");
			}
			else {
				System.out.print(input.substring(i,i + 1));
			
			}		
		}
	System.out.	print("\nI did magics");
	}
}
	 	