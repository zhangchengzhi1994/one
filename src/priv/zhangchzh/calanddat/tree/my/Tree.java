package priv.zhangchzh.calanddat.tree.my;

public class Tree{
	private String data = null;
	private Tree left = null;
	private Tree right = null;

	public Tree(String str){
		this.data=str;
		this.left=null;
		this.right=null;
	}
	
	public void addTree(String str,Tree tree){
		if (str=="left") {
			this.left = tree;
		}else if (str=="right") {
			this.right =tree;
		}
	}
}