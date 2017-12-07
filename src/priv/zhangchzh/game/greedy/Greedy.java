package priv.zhangchzh.game.greedy;

import java.util.ArrayList;
import java.util.List;

public class Greedy {
	Coordinate[] c;
	double temp = 0;
	double vs = 0;
	int best = 0;
	
	public List GreedyList(List<Coordinate> listC){
		Distance d = new Distance();
		for (int i = 0; i < listC.size(); i++) {
			
			for (int j = i+1; j < listC.size(); j++) {
				temp = d.getDistance(listC.get(i), listC.get(j));
				if(i==0){
					vs = temp;
					best = 1;
				}
				if(temp < vs){
					best = j;
					vs = temp;
				}	
			}
			
			listC.add(i+1, listC.get(best));
			listC.remove(vs+1);
		}
		return listC;
	}
	
}
