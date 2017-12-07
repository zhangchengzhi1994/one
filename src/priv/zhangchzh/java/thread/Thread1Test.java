package priv.zhangchzh.java.thread;

public class Thread1Test {
	public static void main(String[] args) {
		Thread mTh1 = new Thread1("A");
//		Thread mTh2 = new Thread1("B");
		Thread mTh2=mTh1;
		mTh1.start();
		mTh2.start();
	}
}
