package priv.zhangchzh.game;

import java.util.Scanner;

public class KittyCat {
	private static StringBuffer sb = new StringBuffer();
	private static String deleteSB = new String();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//先去重复
		String str = excludeRepeatElement(scan.nextLine());
		//进行解码
		StringBuffer result = DecodingDNA(str);
		System.out.println(result);
	}

	private static StringBuffer DecodingDNA(String nextLine) {

		int temp = Integer.parseInt(nextLine);
		//如果只有一位
		if (nextLine.length() == 1) {
			if(Integer.parseInt(nextLine) == 0){
				sb.append("a");
			}else if (Integer.parseInt(nextLine) == 1) {
				sb.append("b");
			}
		}else {
			int length = nextLine.length()/2;
			String a = nextLine.substring(0,length);
			String b = nextLine.substring(length,nextLine.length());
			sb.append("c");
			DecodingDNA(a);
			sb.append("c");
			DecodingDNA(b);
		}
		return sb;
	}
	
	static String excludeRepeatElement(String str){
		for (int i = 1; i < str.length(); i++) {
			char a = str.charAt(i-1);
			char b = str.charAt(i);
			if( a == b){
				str = str = str.substring(0,i-1)+str.substring(i,str.length());
				i--;
			}
		}
		return str;
	}
	
}
