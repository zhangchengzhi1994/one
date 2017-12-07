package priv.zhangchzh.game.greedy;

import java.util.List;

public class Distance {
	public double getDistance(Coordinate a, Coordinate b) {
		int result = (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y) + (a.z - b.z) ^ (a.z - b.z);
		return (double) Math.sqrt(result);
	}
	
	public double getTotalDistance(List<Coordinate> list){
		double total = 0;
		for (int i = 0; i < list.size()-1; i++) {
			total += this.getDistance(list.get(i), list.get(i+1));
		}
		return total;
	}
}
