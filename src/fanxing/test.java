package fanxing;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class test {
	/*
	 * 通过反射来验证"泛型是在编译中被确定，而在编译后不存在"
	 * */
	static void test1(){
		ArrayList<String> a = new ArrayList<String>();
		a.add("CSDN_SEU_Calvin");
		Class c = a.getClass();
		
		try {
			Method method = c.getMethod("add", Object.class);
			method.invoke(a, 100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(a);
	}
	
	static class FX<T>{
		private T ob;
		
		public FX(T ob){
			this.ob = ob;
		}
		
		public T getOb(){
			return ob;
		}
		
		public void showType() {
			System.out.println("T的实际类型是："+ob.getClass().getName());
		}
		
		static {
			FX<Integer> intOb = new FX<Integer>(100);
			intOb.showType();
			System.out.println("value="+intOb.getOb());
			
			FX<String> strOb = new FX<String>("wocao");
			strOb.showType();
			System.out.println("value="+strOb.getOb());
		}
	}
	
	public static void main(String[] args) {
		test1();
		new FX<Integer>(100);
	}
}
