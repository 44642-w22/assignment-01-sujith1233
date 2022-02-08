package problem4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class problem4 {


	public static void main(String[] args) {
	Scanner scan4 = new Scanner(System.in);
	System.out.println("Enter size of Arraylist");
	int xsize=scan4.nextInt();
	System.out.println("Enter integers");
		List<String> A1 = new ArrayList<>();
		for (int i = 0; i < xsize; i++) {
			String str = scan4.next();
			A1.add(str);
		}
		List<String> A2 = getSortedStrings(A1);
		System.out.println(A2);
	}

	public static List<String> getSortedStrings(List<String> A1) {
		List<String> A2 = new ArrayList<>();
		for (int i = 0; i < A1.size(); i++) {
			A2.add(A1.get(i));
		}
		Collections.sort(A2, (j, k) -> j.length() - k.length());
		return A2;
	}

}



