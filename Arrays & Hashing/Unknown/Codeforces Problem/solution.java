import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int count = 0;
		boolean notSame = true;
		for(int i = 0; i < str.length(); i++) {
			notSame = true;
			for(int j = 0; j < i; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					notSame = false;
					break;
				}
			}
			if(notSame) {
				count++;
			}
			
		}
		
		if(count%2 != 0) {
			System.out.println("IGNORE HIM!");
		}
		else {
			System.out.println("CHAT WITH HER!");
		}

	}

}
