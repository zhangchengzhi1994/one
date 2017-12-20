package priv.zhangchzh.java.rf;

public class GetInterfaces {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void getInterfaces(String className){
		try {
			Class c1 = Class.forName(className);
			Class[] ifs = c1.getInterfaces();
			for (int i = 0; i < ifs.length; i++) {
				String IName = ifs[i].getName();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		GetInterfaces.getInterfaces("priv.zhangchzh.java.rf.User");
	}
}
