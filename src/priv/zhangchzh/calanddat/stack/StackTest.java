package priv.zhangchzh.calanddat.stack;

import java.util.HashMap;
import java.util.Map;

public class StackTest {
	public static void main(String[] args) {
		Stack sta = new Stack();
		String str = "123456";
		sta.push(str);
		Map map = new HashMap();
		map.put("1", "111");
		map.put("2", "222");
		sta.push(map);
		Object a = sta.peek();
		Object b = sta.pop();
		Object c = sta.peek();
		String str2 = "654321";
		sta.push(str2);
		System.out.println("ss");
	}
}
