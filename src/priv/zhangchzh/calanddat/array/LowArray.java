package priv.zhangchzh.calanddat.array;

public class LowArray {
	long[] ary;

	public LowArray(int i) {
		ary = new long[i];
	}

	public void setElem(int i, long j) {
		ary[i] = j;
	}

	public long getElem(int i) {
		return ary[i];
	}
	
//	public int lenth() {
//		ary.;
//	}
}
