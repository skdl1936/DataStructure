package Chapter02;

public class CardConvRev {
	static int cardConvR(int x , int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r); // r로 나눈 나머지를 저장
			x /=r;
		}while(x!=0);
		
		
		
		return digits;
	}
	
	public static void main(String[] args) {
		char[] d= new char[10];
		int length = cardConvR(59,2,d);
		System.out.println(d);
		
		for (int i = length -1; i >=0; i--) {
			System.out.print(d[i]);
		}
		System.out.println();
	}

}
