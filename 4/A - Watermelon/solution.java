import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		
		boolean flag = false;
		
		for(int i = 1; i < n; i++) {
			if((i%2 == 0) && ((n-i)%2 == 0)) {
				flag = true;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
 
	}
 
}