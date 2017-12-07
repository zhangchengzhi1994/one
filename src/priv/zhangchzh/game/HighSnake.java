package priv.zhangchzh.game;

import java.util.Scanner;

/*
 *  1 3 6 10 15
 *  2 5 9 14
 *	4 8 13
 *	7 12
 *	11
 * 
 * */
 
public class HighSnake {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		setSnake(scan.nextLine());
	}
	
	static void setSnake(String string){
		int size = Integer.parseInt(string);
		int[][] it = new int[size][size];
		int data = 1 ;//每次复制后自增
		it[0][0] = data++;//为第一位赋值1
		int zI = 0;
		int zJ = 0;
		//指针位置蛇形移动
		for (int i = 0; i < size; i++) {
			zI = i;//x坐标初始化
			for (int j = 0; j < i; j++) {
				while (zI != -1) {
					it[zI--][zJ++] = data++;
				} 
			}
			zJ = 0;//y坐标初始化
		}
		
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
		System.out.println("1111111111");
	}
}
