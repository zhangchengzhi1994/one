package priv.zhangchzh.designMode.simpleFactory;

//具体产品
public class Bmw extends Car {

	@Override
	public void drive() {
		  System.out.println(this.getName()+"----go-----------------------");  
	}

}
