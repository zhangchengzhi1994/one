package priv.zhangchzh.game;

import java.util.Scanner;

public class FrogDate {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int xv = x.nextInt();
		Scanner y = new Scanner(System.in);
		int yv = x.nextInt();
		Scanner m = new Scanner(System.in);
		int mv = x.nextInt();
		Scanner n = new Scanner(System.in);
		int nv = x.nextInt();
		Scanner l = new Scanner(System.in);
		int lv = x.nextInt();
		setFD(xv, yv, mv, nv, lv);
		System.out.println(setFD(xv, yv, mv, nv, lv));
	}

	private static int setFD(int xv, int yv, int mv, int nv, int lv) {
		int a = 0;
		while (mv != nv) {
			mv += xv;
			nv += yv;
			if (mv > lv) {
				mv -= lv;
			}
			if (nv > lv) {
				nv -= lv;
			}
			a++;
		}
		return a;
	}
}
