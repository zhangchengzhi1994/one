package mail;

import java.util.Date;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class Main
{
  public static String myEmailAccount = "18890757362@163.com";
  public static String myEmailPassword = "zhang0619";
  public static String myEmailSMTPHost = "smtp.163.com";
  public static String receiveMailAccount = "1740129766@qq.com";

  public static void main(String[] args)
    throws Exception
  {
    Properties props = new Properties();
    props.setProperty("mail.transport.protocol", "smtp");
    props.setProperty("mail.smtp.host", myEmailSMTPHost);
    props.setProperty("mail.smtp.auth", "true");

    Session session = Session.getInstance(props);
    session.setDebug(true);

    MimeMessage message = createMimeMessage(session, myEmailAccount, receiveMailAccount);

    Transport transport = session.getTransport();

    transport.connect(myEmailAccount, myEmailPassword);

    transport.sendMessage(message, message.getAllRecipients());

    transport.close();
  }

  public static MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail)
    throws Exception
  {
    MimeMessage message = new MimeMessage(session);

    message.setFrom(new InternetAddress(sendMail, "zhangchengzhi", "UTF-8"));

    message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "zhangchengzhi", "UTF-8"));
    message.setRecipient(MimeMessage.RecipientType.CC, new InternetAddress("18890757362@163.com", "张承志", "UTF-8"));

    message.setSubject("请认真查看", "UTF-8");

    message.setContent("吃一堑涨一智", "text/html;charset=UTF-8");

    message.setSentDate(new Date());

    message.saveChanges();

    return message;
  }
}