package mail;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class MailAuthenticator
{
  public static void main(String[] args)
    throws Exception
  {
    Properties props = new Properties();
    Session session = Session.getInstance(props);
    MimeMessage message = new MimeMessage(session);

    message.setFrom(new InternetAddress("18624043839@163.com", "USER_AA", "UTF-8"));

    message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress("1740129766@qq.com", "USER_CC", "UTF-8"));

    message.setSubject("TEST邮件主题", "UTF-8");

    message.setContent("TEST这是邮件正文。。。", "text/html;charset=UTF-8");

    message.setSentDate(new Date());

    message.saveChanges();

    OutputStream out = new FileOutputStream("MyEmail.eml");
    message.writeTo(out);
    out.flush();
    out.close();
  }
}