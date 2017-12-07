package priv.zhangchzh.java;

import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String[] args) {
		/**正则表达式*/
//		String content = "i am noob from runoob.com";
//		String pattern = ".*a.*";
//		boolean isMath = Pattern.matches(pattern,content);
//		System.out.println(isMath);
		
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(\\d*)(\\d+)(.*)";
		System.out.println(pattern);
		
	}
}
