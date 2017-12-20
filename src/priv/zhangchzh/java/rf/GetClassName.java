package priv.zhangchzh.java.rf;

import mail.Main;

public class GetClassName {
	
	public String getNameByClass() {
		String name = "";
		System.out.println("通过类获取对象");
		Class UserClass = this.getClass();
		System.out.println("获取对象成功！\n");
		
		//get class name
		name = UserClass.getName();
		return name;
	}
	
	public static void main(String[] args) {
		GetClassName gcn = new GetClassName();
		
		System.out.println("class name is"+gcn.getNameByClass());
	}
}
