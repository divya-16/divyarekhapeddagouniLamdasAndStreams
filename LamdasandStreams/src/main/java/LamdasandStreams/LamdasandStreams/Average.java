package LamdasandStreams.LamdasandStreams;
import java.util.*;
import java.util.function.Consumer;
public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of  Elements");
		int num = sc.nextInt();
		System.out.println("Enter elements separated by space,ending with a character");
		List<Integer> a = new ArrayList<Integer>();
		try {
		while(true) {
			a.add(sc.nextInt());
		}
		} catch(Exception e) {
			
		}
		
		findAvg(a,(Integer n) -> System.out.println("The Average of Integers is "+ (n / (float)num)));
	}
	
	public static void  findAvg(List<Integer> l, Consumer<Integer> con) {
		int sum= 0;
		for(int i : l) {
			sum+=i;
		}
		con.accept(sum);
	}

}
