package priv.zhangchzh.designMode.simpleFactory;

import java.io.IOException;

public class BossSimplyFactory {
	 public static void main(String[] args) throws IOException {  
	        //老板告诉司机我今天坐奔驰
		 	Driver d = new Driver();
	        Car car = d.createCar("benz");  
	        car.setName("benz");  
	         //司机开着奔驰出发  
	        car.drive();  
	 }
}
