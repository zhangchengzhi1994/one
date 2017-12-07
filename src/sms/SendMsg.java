package sms;  
  
import org.apache.commons.httpclient.Header;  
import org.apache.commons.httpclient.HttpClient;  
import org.apache.commons.httpclient.NameValuePair;  
import org.apache.commons.httpclient.methods.PostMethod;  
/**  
 * 测试发送短信  
 *   
 * @author zrz  
 */  
public class SendMsg {  
	
	public static void main(String[] args)throws Exception
	{

	HttpClient client = new HttpClient();
	PostMethod post = new PostMethod("http://utf8.api.smschinese.cn"); 
	post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");//在头文件中设置转码
	NameValuePair[] data ={ new NameValuePair("Uid", "张承志1994"),  
				            new NameValuePair("Key", "b3fdbe851e48a5023f77"),  
				            new NameValuePair("smsMob", "18890757362"),  
				            new NameValuePair("smsText", "王佳宁接收：你干嘛呢，哈哈哈哈") };
	post.setRequestBody(data);

	client.executeMethod(post);
	Header[] headers = post.getResponseHeaders();
	int statusCode = post.getStatusCode();
	System.out.println("statusCode:"+statusCode);
	for(Header h : headers)
	{
	System.out.println(h.toString());
	}
	String result = new String(post.getResponseBodyAsString().getBytes("utf-8")); 
	System.out.println(result); //打印返回消息状态
	post.releaseConnection();
    }  
}  