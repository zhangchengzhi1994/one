package priv.zhangchzh.designMode.simpleFactory;

public class Benz extends Car {

	@Override
	public void drive() {
		System.out.println(this.getName()+"-------go--------");
	}
	
}
