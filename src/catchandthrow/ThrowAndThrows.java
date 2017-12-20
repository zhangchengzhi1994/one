package catchandthrow;

import java.util.HashMap;
import java.util.Map;


public class ThrowAndThrows {

    public static double sqrt(String nStr) throws Exception {
        if (nStr == null) {
            throw new Exception("输入的字符不能为空！");
        }
        double n = 0;
        try {
            n = Double.parseDouble(nStr);
        } catch(NumberFormatException e) {
            throw new Exception("输入的字符串必须能够转化成数字！", e);
        }
        if (n < 0 ){
            throw new Exception("输入的字符串转化成的数字必须大于0！");
        }
        return Math.sqrt(n);
    }
    
    public static void main(String[] args) throws Exception {
        try{
            ThrowAndThrows.sqrt("-124.56");
        } catch(Exception e) {
            System.out.println("Got a Exception：" + e.getMessage());
            e.printStackTrace();
            throw e;    //不做进一步处理，将异常向外抛出
        }
        
        ThrowAndThrows.sqrt("-124.56");
    }
}