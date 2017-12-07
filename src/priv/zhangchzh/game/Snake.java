package priv.zhangchzh.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Snake {
	public static void main(String[] args) {
		System.out.println("输入");
		Scanner scan = new Scanner(System.in);
		setSnake(scan.nextLine());
	}

	private static void setSnake(String nextLine) {
		int size = Integer.parseInt(nextLine);
		int[][] data = new int[size][size];
		int cData;
		//逻辑数组
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size-i ; j++) {
				if (i % 2 == 0) {
					// 单数行
					cData = nAdd(i-1);//累加
					data[i][j] = i * size - cData + 1 + j;
				} else {
					// 双数行
					cData = nAdd(i);// 累加
					data[i][j] = (i + 1) * size - cData - j;
				}
			}
		}
		//展示数组
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}
	
	//累加
	private static int nAdd(int n) {
		int result = 0;
		for (int i = 1; i < n + 1; i++) {
			result += i;
		}
		return result;
	}
}