package priv.zhangchzh.calanddat.array;

public class LowArrayApp {
	public static void main(String[] args) {
		LowArray la = new LowArray(10);
		StringBuffer sb = new StringBuffer();

		la.setElem(0, 11);
		la.setElem(1, 22);
		la.setElem(2, 33);
		la.setElem(3, 44);
		la.setElem(4, 55);
		la.setElem(5, 66);
		la.setElem(6, 77);
		la.setElem(7, 88);
		la.setElem(8, 99);
		la.setElem(9, 98);

		for (int i = 0; i < 10; i++) {
			sb.append(la.getElem(i) + " ");
		}
		System.out.println(sb);
		sb = new StringBuffer();
		
		for (int i = 0; i < 10; i++) {
			if (la.getElem(i) == 22) {
				for (int j = i; j < 9; j++) {
					long a = la.getElem(j+1);
					la.setElem(j, a);
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			sb.append(la.getElem(i) + " ");
		}
		System.out.println(sb);
		
	}
}
