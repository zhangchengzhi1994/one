package priv.zhangchzh.java.thread;

public class Thread1 extends Thread{
	private String name;
	public Thread1(String name){
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + i);
			try {
				sleep((long) (Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
