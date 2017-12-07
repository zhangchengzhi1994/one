package priv.zhangchzh.calanddat.array;

public class HighArray {
	private long[] a;
	private int nElems;
	private StringBuffer sb;
	
	public HighArray(int max){
		a = new long[max];
		nElems = 0;
	}
	
	//查询函数
	public void find(long searchKey) {
		for (int i = 0; i < nElems; i++) {
			if(a[i] == searchKey){
				System.out.println(i+"项目是："+searchKey);
			}else {
			}
		}
	}
	
	public void getMax(){
		long b = 0;
		for (int i = 0; i < nElems; i++) {
			if (a[i] > b) {
				b = a[i];
			}
		}
		System.out.println(b);
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public void delete(long value) {
		for (int i = 0; i < nElems; i++) {
			if(a[i]==value){
				for (int j=i+1; j < a.length; j++) {
					a[i] = a[j];
					i++;
				}
				nElems--;
			}
		}
		this.display();
	}
	
	public StringBuffer display() {
		sb = new StringBuffer();
		for (int i = 0; i < nElems; i++) {
			sb.append(a[i]);
			sb.append(" ");
		}
		System.out.println(sb);
		return null;
	}
	
	public void maopaopaixu(){
		for (int i = 0; i < nElems; i++) {
			for (int j = i+1; j < nElems; j++) {
				if (a[j] < a[i]) {
					long c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		this.display();
	}
	
	public void erfencharu(long in){
		int temp = this.dingwei(in, 0, nElems);
		for (int i = nElems; i > temp; i--) {
			a[i]=a[i-1];
		}
		a[temp] = in;
		nElems++;
		this.display();
	}
	
	private int dingwei(long in,int left,int right){
		int temp = left;
		while(left!=right-1){
			temp = (right+left)/2;
			if (a[temp]<in) {
				left=temp;
				dingwei(in, left, right);
			}else {
				right=temp;
				dingwei(in, left, right);
			}
		}
		return temp;
	}
}
