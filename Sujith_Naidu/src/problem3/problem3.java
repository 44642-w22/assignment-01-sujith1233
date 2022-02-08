package problem3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter size of Arraylist");
		int lsize = scan3.nextInt();
		System.out.println("Enter integers");
		List<Integer> A1 = new ArrayList<>();
		for (int i = 0; i < lsize; i++) {
			int n = scan3.nextInt();
			A1.add(n);
		}
		int s = getMaximumNum(A1);
		System.out.println(s);
	}

	public static int getMaximumNum(List<Integer> A1) {
		int maxNum = Integer.MIN_VALUE;
		for (int i = 0; i < A1.size(); i++) {
			maxNum = Math.max(maxNum, A1.get(i));
		}
		return maxNum;
	}



}
