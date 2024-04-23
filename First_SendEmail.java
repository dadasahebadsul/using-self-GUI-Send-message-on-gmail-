import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class First_SendEmail
{
	
	 public static void sender(String to, String sub, String msg) 
	 {
     

      final String username = "projectsystem21@gmail.com";
      final String password = "ujhrlmnhbgbosgyk";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", "smtp.gmail.com");
      props.put("mail.smtp.port", "25");

      Session session = Session.getInstance
                                      (props,new javax.mail.Authenticator()
    {
       protected PasswordAuthentication getPasswordAuthentication()
       { 
           return new PasswordAuthentication(username, password);
	   }
   });

      try
      {
	 	  Message message = new MimeMessage(session);

	  	  message.setFrom(new InternetAddress(username));

	  	  message.setRecipients(Message.RecipientType.TO,
	  	                                            InternetAddress.parse(to));

	  	  message.setSubject(sub);

	  	  message.setText(msg );

	  	  Transport.send(message);

	  	  System.out.println("Sent message successfully....");
      }
      catch (MessagingException e)
      {
         throw new RuntimeException(e);
      }
   }
}






