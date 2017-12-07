package priv.zhangchzh.java;

/**
 * 
 * @deprecated 非常有意思
 * */
public class ArgumentTest {
	public static void main(String[] args) {
		 System.out.println("打印所有的参数:");  
	        if(args.length>0){  
	            for(int i=0;i<args.length;i++){  
	                System.out.println("第"+i+"个参数为:"+args[i]);  
	            }  
	        }  
	        System.out.println("打印系统变量:");  
	        String env = System.getProperty("wjn");  
	        System.out.println("service.env:"+env);  
	        String logpath = System.getProperty("zcz");  
	        System.out.println("logfile.path:"+logpath);
	        String date = System.getProperty("zcz");
	        System.out.println(date);
	}
}
