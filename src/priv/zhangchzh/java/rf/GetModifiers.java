package priv.zhangchzh.java.rf;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetModifiers {
	
	private String username = "liu shui jing";
	float f = Float.parseFloat("1.000");
	public static final int i = 37;
	
	//get class modifiers
	public static String userModifiers(User ui){
		Class uc = ui.getClass();
		int m = uc.getModifiers();
		System.out.println(Modifier.toString(m));
		return Modifier.toString(m);
	}
	
	//get local modifiers
	public void checkThisClassModifiers(){
		Class tc = this.getClass();
		Field[] fl = tc.getFields();
		for (int i = 0; i < fl.length; i++) {
			System.out.println(Modifier.toString(fl[i].getModifiers()));
		}
	}
	
	public static void main(String[] args){
		User u = new User();
		GetModifiers.userModifiers(u);
		
		GetModifiers gm = new GetModifiers();
		gm.checkThisClassModifiers();
	}
}
