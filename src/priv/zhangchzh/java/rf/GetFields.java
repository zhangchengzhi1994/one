package priv.zhangchzh.java.rf;

import java.lang.reflect.Field;

public class GetFields {
	
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void getFieldNames(String className){
		try {
			Class c = Class.forName(className);
			Field[] fds = c.getFields();
			for(int i=0;i<fds.length;i++){
				String fn = fds[i].getName();
				Class tc =  fds[i].getType();
				String ft = tc.getName();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		GetFields.getFieldNames("priv.zhangchzh.java.rf.User");
	}
}
