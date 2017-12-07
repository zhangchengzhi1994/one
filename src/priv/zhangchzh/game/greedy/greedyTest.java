package priv.zhangchzh.game.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ListCellRenderer;

public class greedyTest {

	public static void main(String[] args) {
		String str;
		int size;
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		List<Coordinate> listC = new ArrayList();
		for (int i = 0; i < size; i++) {
			Scanner sc = new Scanner(System.in);
			str = sc.nextLine();
			listC.add(new Coordinate(str));
		}
		
		Greedy g = new Greedy();
		List<Coordinate> result = g.GreedyList(listC);
		Distance d = new Distance();
		System.out.println(d.getTotalDistance(result));
	}
}
