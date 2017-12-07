package priv.zhangchzh.designMode.simpleFactory;

//抽象产品
abstract class Car {
	private String name;
	public abstract void drive();
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}
