package priv.zhangchzh.java.rf;

public class ReflectTest {
	public static void main(String[] args) {
		IUser u = new User();
		System.out.println(1111);
		System.out.println(1111);
		System.out.println(1111);
		System.out.println(1111);
		System.out.println(1111);
		Class c3 = u.getClass();
		
		Class c2 = User.class;
		
		try {
			Class c1 = Class.forName("User");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
