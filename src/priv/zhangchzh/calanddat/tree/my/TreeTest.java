package priv.zhangchzh.calanddat.tree.my;


public class TreeTest{
	
	public static void main(String[] args) {
		Tree tree1 = new Tree("a");
		Tree tree2 = new Tree("b");
		Tree tree3 = new Tree("c");
		tree1.addTree("left",tree2);
		tree1.addTree("right",tree3);
	}
}
