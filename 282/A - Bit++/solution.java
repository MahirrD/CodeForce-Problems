import java.util.Scanner;
 
public class Practice {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		String[] stm = new String[n];
		for(int row = 0; row < n; row++) {
			stm[row] = sc.next();
		}
		
		int x = 0;
		for(int row = 0; row < n; row++) {
			char first = stm[row].charAt(0);
			char second = stm[row].charAt(1);
			char third = stm[row].charAt(2);
			if((first == '+' && second == '+') || (second == '+' && third == '+')) {
				x++;
			}
			else if((first == '-' && second == '-') || (second == '-' && third == '-')) {
				x--;
			}
		}
		
		System.out.println(x);
		
	}
 
}