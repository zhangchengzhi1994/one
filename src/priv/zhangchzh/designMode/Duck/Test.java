package priv.zhangchzh.designMode.Duck;

public class Test {
	public static void main(String[] args) {
		Duck hDuck = new HomebredDuck();
		Duck wDuck = new WildDuck();
		Fly CF = new CanFly();
		Fly NF = new CantFly();
		
		hDuck.SetFly(NF);
		wDuck.SetFly(CF);
		
		hDuck.fly.isFly();
		wDuck.fly.isFly();
	}
}
