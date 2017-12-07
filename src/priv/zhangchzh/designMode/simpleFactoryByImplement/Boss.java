package priv.zhangchzh.designMode.simpleFactoryByImplement;


//不管用户想使用宝马还是奔驰
public class Boss {
	public static void main(String[] args) {
		Driver xiaozhang = new Driver();
		Car car = xiaozhang.comeAndCar("BMW");
		
		//都是用call
		car.call();
	}
}
