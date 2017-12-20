package priv.zhangchzh.java.rf;

import java.lang.reflect.Method;

public class GetMethod {
	
	//get class methods
	public static void getMethods(String className){
		//get class
		try {
			Class c = Class.forName(className);
			//get methods
			Method[] m = c.getMethods();
			//erg0dic methods
			for (int i = 0; i < m.length; i++) {
				String name = m[i].getName();
				System.out.println(name);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		GetMethod.getMethods("priv.zhangchzh.java.rf.User");
	}
}
