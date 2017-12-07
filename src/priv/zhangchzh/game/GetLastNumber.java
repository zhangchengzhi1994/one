package priv.zhangchzh.game;

public class GetLastNumber {
	public static void main(String[] args) {
		int a = 1101;//8
		System.out.println(factorial(a));
	}

	static int factorial(int a) {
		int total=1;
		for (int i = 1; i <= a; i++) {
			total*=i;
			while(total%10==0){
				total/=10;
			}
			total%=10;
		}
		return total;
	}
}
