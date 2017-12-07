package priv.zhangchzh.designMode.simpleFactoryByImplement;

public class Driver {

	public Car comeAndCar(String a) {
		Car c = null;
		if(a == "Benz"){
			c = new Benz();
		}else if(a == "BMW"){
			c = new BWM();
		}
		return c;
	}

}
