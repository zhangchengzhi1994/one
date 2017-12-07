package priv.zhangchzh.calanddat.array;

public class ArrayApp {

	public static void main(String[] args) {
		long[] ary = new long[100];
		StringBuffer sb = new StringBuffer();

		ary[0] = 53;
		ary[1] = 64;
		ary[2] = 84;
		ary[3] = 86;
		ary[4] = 52;
		ary[5] = 76;
		ary[6] = 87;
		ary[7] = 99;
		ary[8] = 42;
		ary[9] = 26;

		for (int i = 0; i < 10; i++) {
			sb.append(ary[i] + " ");
		}
		System.out.println(sb);

		for (int i = 0; i < 10; i++) {
			if (ary[i] == 64) {
				System.out.println("第" + i+1 + "项是：64");
				System.out.println("删除第" + i+1 + "项后：");
			}
		}

		for (int i = 0; i < 10; i++) {
			if (ary[i] == 64) {
				for (int j = i; j < 10; j++) {
					ary[j] = ary[j + 1];
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			sb.append(ary[i] + " ");
		}
		System.out.println(sb);
	}
}
