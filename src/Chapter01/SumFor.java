package Chapter01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0 ;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum +"입니다.");
		
		System.out.println("가우스 : " + gauss(n));
	}
	
	public static int gauss(int n) {
		// 가우스 덧셈 : 첫값과 끝값의 합은 항상 같다 
		// 그러므로 첫값과 끝값의 합을 몇번나오는지 곱해주면 된다.
		// 또한 홀수이면 가운데 값을 더해준다.
		
		int total= (1+n)*(n/2) + (n%2==0 ? 0 : (n+1)/2);
		return total;
	}
}
