package Chapter01;

import java.util.Scanner;

public class Max3 {
	
	static int max3(int a, int b, int c) {
		int max = a;
		
		if(max < b) 
			max =  b;
		
		if (max < c)
			max = c;
		
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		System.out.print("c의 값 : ");
		int c = sc.nextInt();
		
		int max = max3(a,b,c);
		
		System.out.println("최대값 max의 값은 : " + max);
	}
}
