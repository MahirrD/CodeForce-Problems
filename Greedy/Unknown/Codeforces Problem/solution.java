import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//main logic
		int n = sc.nextInt();
		int[][] arr = new int[n][3];
		for(int row = 0; row < n; row++) {
			for(int col = 0; col < 3; col++) {
				arr[row][col] = sc.nextInt();
				if(arr[row][col] != 0 && arr[row][col] != 1) {
					break;
				}
			}
		}

		int count;
		int soln = 0;
		for(int row = 0; row < n; row++) {
			count = 0;
			for(int col = 0; col < 3; col++) {
				if(arr[row][col] == 1) {
					count++;
				}
			}
			if(count >= 2) {
				soln++;
			}
		}
		
		System.out.println(soln);
		
	}

}
