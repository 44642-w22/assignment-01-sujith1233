package problem5;


import java.util.Scanner;
import java.util.Stack;

public class problem5 {

	public static void main(String[] args) {
		System.out.println("Enter input string of brackets");
		Scanner scan5 = new Scanner(System.in);
		String str = scan5.next();
		boolean isBalanced = isBalancedExpression(str);
		System.out.println(isBalanced);
	}

	public static boolean isBalancedExpression(String str) {
		Stack<Character> st1 = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c1 = str.charAt(i);
			char topElement = st1.isEmpty() ? '#' : st1.peek();
			if (c1 == ']') {
				if (topElement == '[')
					st1.pop();
				else
					return false;
			} else if (c1 == ')') {
				if (topElement == '(')
					st1.pop();
				else
					return false;
			} else if (c1 == '}') {
				if (topElement == '{')
					st1.pop();
				else
					return false;
			} else
				st1.push(c1);
		}
		return st1.isEmpty();
	}

}



