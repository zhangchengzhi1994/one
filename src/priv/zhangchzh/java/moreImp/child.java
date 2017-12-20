package priv.zhangchzh.java.moreImp;

public class child implements father , mother{

	public void call() {
		System.out.println("im m");
	}

	@Override
	public void say() {
		System.out.println("im f");
	}

}
