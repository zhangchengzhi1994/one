package priv.zhangchzh.calanddat;

import com.ctc.wstx.util.StringUtil;

public class DxXx {
    public static void main(String[] args) {
        String s = calTotalYjdx(2231234.36);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
    
    private static String calTotalYjdx(double yjje) {
        //将数字变成单纯的字符串
        String string = String.valueOf(yjje).replace(".", "");
        // 大写数字
        String[] numbers = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        //数位对应名称
        String[] d = {"分","角","元","拾","佰","仟","万","拾","佰","仟","亿"};
        StringBuffer sb = new StringBuffer();
        char[] c = string.toCharArray();//后面的是分。所以倒叙遍历
        int idx = 0;
        for(int i =c.length-1;i>=0;i-- ) {
            //我确定我传入的数字是两位小数的，从分开始。所以不做额外判断
            //也因为不会超过亿，所以idx也不判断
            sb.append(d[idx++]+(numbers[c[i]-'0']));
        }
        //之前是倒叙追加的。现在直接反转
        return sb.reverse().toString();
    }
}
