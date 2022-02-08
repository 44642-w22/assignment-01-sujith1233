package problem1;


	import java.util.LinkedList;
	import java.util.List;
	import java.util.Scanner;

	public class problem1 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter size of linkedlist");
			int Lsize=scan.nextInt();
			System.out.println("Enter integers");
			List<Integer> L1 = new LinkedList<>();
			for (int i = 0; i < Lsize; i++) {
				int s = scan.nextInt();
				L1.add(s);
			}

			List<Integer> L2 = getPerfectNumber(L1);
			System.out.println(L2);
		}

		public static List<Integer> getPerfectNumber(List<Integer> L1) {
			List<Integer> L2 = new LinkedList<>();
			for (int i = 0; i < L1.size(); i++) {
				int x = L1.get(i);
				int s = 0;
				for (int j = 1; j < x; j++) {
					if (x % j == 0) {
						s += j;
					}
				}
				if (s == x) {
					L2.add(x);
				}
			}
			return L2;
		}

	}


