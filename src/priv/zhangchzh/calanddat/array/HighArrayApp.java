package priv.zhangchzh.calanddat.array;

public class HighArrayApp {
	public static void main(String[] args) {
		HighArray arr = new HighArray(10);
		arr.insert(24);
		arr.insert(34);
		arr.insert(24);
		arr.insert(25);
		arr.insert(33);
		arr.insert(15);
		arr.insert(7);
		arr.insert(88);
		arr.insert(9);
		
		arr.getMax();
//		arr.delete(8);
		arr.maopaopaixu();
		arr.erfencharu(18);
	}
}
