package priv.zhangchzh.game;

import java.util.Scanner;

public class seven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSeven(scan.nextLine()));
	}

	private static StringBuffer getSeven(String nextLine) {
		int max = Integer.parseInt(nextLine);
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= max; i++) {
			if (i%10 == 7) {
				sb.append(i+" ");
				continue;
			}if (i%7 == 0) {
				sb.append(i+" ");
				continue;
			}
		}
		return sb;
	}
	
//	static int getN(int a){
//		String str = Integer.toString(a);
//		for (int i = 1; i < str.length(); i++) {
//			a
//		}
//	}
	
}
