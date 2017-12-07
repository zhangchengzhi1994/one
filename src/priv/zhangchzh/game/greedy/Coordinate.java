package priv.zhangchzh.game.greedy;


public class Coordinate {
	public int x;
	public int y;
	public int z;
	public Coordinate(String str) {
		String[] s = str.split(",");
		this.x = Integer.parseInt(s[0]);
		this.y = Integer.parseInt(s[1]);
		this.z = Integer.parseInt(s[2]);
	}
}
