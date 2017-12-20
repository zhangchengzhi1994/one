package priv.zhangchzh.java.rf;

public class User implements IUser {
	private String name = null;
	private String age = null;
	
	public String str = "111";
	public int i = 222;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
