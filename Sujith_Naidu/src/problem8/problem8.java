package problem8;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
public class problem8 {
	public static void main(String[] args) 
	{
		Scanner scan8 = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int queueSize= scan8.nextInt();
		System.out.println("Enter input Queue elements");
		Deque<Integer> Q = new ArrayDeque<>();
		for(int i=0;i<queueSize;i++)
		{
			int s = scan8.nextInt();
			Q.add(s);
		}
		List<Integer> A = getAlternativeSeq(Q);
		System.out.println(A);
	}
	
	public static List<Integer> getAlternativeSeq(Deque<Integer> Q)
	{
		List<Integer> a = new ArrayList<>();
		while(!Q.isEmpty()) 
		{
			a.add(Q.pollLast());
			if(!Q.isEmpty())
				a.add(Q.pollFirst());
		
		}
		return a;
	}
	

}
