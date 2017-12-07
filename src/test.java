
public class test {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		int s0;
		int s1;
		int s2;
		
		
		s0=s1=s2=0;
		for (int i = 0; i < 8; i++) {
			switch(a[i] % 3 ){
			case 0 : s0 += a[i];break;
			case 1 : s1 += a[i];break;
			case 2 : s2 += a[i];break;
			}
		}
		
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
