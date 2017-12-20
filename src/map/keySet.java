package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class keySet {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)  {
		Map map = new HashMap();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		Set keys1 = map.keySet();
		Set keys2 = map.keySet();
		Set keys3 = map.keySet();
		System.out.println(keys1);
		System.out.println(keys2);
		System.out.println(keys3);
	}
}
