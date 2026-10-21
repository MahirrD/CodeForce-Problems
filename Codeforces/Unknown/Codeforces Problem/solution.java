import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		
		int[] storage = new int[n];
		
		for(int i = 0; i < n; i++) {
			int count = 0;
			str[i] = sc.next();
			for(int j = 1; j < str[i].length() - 1; j++) {
				count++;
			}
			storage[i] = count;
		}
		
		for(int i = 0; i < n; i++) {
			if(str[i].length() > 10) {
				char first = str[i].charAt(0);
				char last = str[i].charAt(str[i].length() - 1);
				System.out.println(" " + first + storage[i] + last);
			}
			else {
				System.out.println(" " + str[i]);
			}
		}
				

	}

}
