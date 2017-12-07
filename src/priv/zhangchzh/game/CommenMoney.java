package priv.zhangchzh.game;

public class CommenMoney {
	
	public static void main(String[] args) {
		int[] a = {100,50,20,10,5,1};
		System.out.println(giveChange(269,a));
	}

	static StringBuffer giveChange(int i, int[] a) {
		int num,l;
		StringBuffer sb = new StringBuffer();
		l=i;
		for (int j : a) {
			if(l>=j){
			num = l / j;
			sb.append(num+"*"+j+";");
			l=l%j;}
		}
		return sb;
	}
}
