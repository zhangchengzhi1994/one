package priv.zhangchzh.java;

/**
 * 构造方法就是强迫class在生成的时候去调用一个方法。
 * */
public class KeyWordStatic {
	private static int numInstance = 0;

	protected static int getCount() {
		return numInstance;
	}

	private static void addInstance() {
		numInstance++;
	}

	KeyWordStatic() {
		KeyWordStatic.addInstance();
	}

	public static void main(String[] args) {
		System.out.println(KeyWordStatic.getCount());
		for (int i = 0; i < 500; i++) {
//			new KeyWordStatic();//可以
			KeyWordStatic.addInstance();//也可以...
		}
		System.out.println(KeyWordStatic.getCount());
	}
}
