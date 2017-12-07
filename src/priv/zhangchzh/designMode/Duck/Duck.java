package priv.zhangchzh.designMode.Duck;

public abstract class Duck {
	public Fly fly;
	
	public void Swimming(){
		System.out.println("swim");
	}
	
	public void SetFly(Fly fly){
		this.fly = fly;
	}
}
