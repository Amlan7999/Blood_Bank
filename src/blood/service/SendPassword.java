package blood.service;

import blood.db.Admin;
import blood.db.Users;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendPassword {

	public static void sendEmailAndPassword(Users u) {
		String to = u.getEmailid();
		String subject = "Password Sent";
		String message = "Hello User , Your emailid is " + u.getEmailid() + " Password is : " + u.getPassword();

		String from = "thetechpoint.project@gmail.com"; // give ur mailid
		String password = "thetechpoint1"; // give ur passsword

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}
	}

	public static String sendUserOtp(Users u) {
		String to = u.getEmailid();
		String subject = "OTP Sent";
		char[] msg1 = otpGenerate(5);
		String otp1 = String.valueOf(msg1);
		String message = "Dear user your OTP is: " + otp1;

		String from = "thetechpoint.project@gmail.com"; // give ur mailid
		String password = "thetechpoint1"; // give ur passsword

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}
		return otp1;
	}

	private static char[] otpGenerate(int len) {
		System.out.println("Generating OTP using random():");
		System.out.println("Your new OTP is:");

		String numbers = "123456789";
		Random r = new Random();
		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			otp[i] = numbers.charAt(r.nextInt(numbers.length()));
		}

		return otp;
	}

	public static void sendUsersPassword(Users a, String emailid) {
		String to = emailid;
		String subject = "Password Sent";
		String message = "Hello User , Your emailid is " + emailid + " Password is : " + a.getPassword();

		String from = "lit.lab.project@gmail.com"; // give ur mailid
		String password = "litproject2018"; // give ur passsword

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {

			e.printStackTrace();
		}
	}

	public static void sendAdminPassword(Admin a, String emailid) {
		String to = emailid;
		String subject = "Password Sent";
		String message = "Hello User , Your emailid is " + emailid + " Password is : " + a.getPassword();

		String from = "thetechpoint.project@gmail.com"; // give ur mailid
		String password = "thetechpoint1"; // give ur passsword

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}
	}

	public static String sendAdminOtp(Admin u) {

		String to = u.getEmailid();
		String subject = "OTP Sent";
		char[] msg1 = otpGenerate(5);
		String otp1 = String.valueOf(msg1);
		String message = "Dear admin your OTP is: " + otp1;

		String from = "thetechpoint.project@gmail.com"; // give ur mailid
		String password = "thetechpoint1"; // give ur passsword

		try {
			// Authentication with Gmail server
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			};

			Session session = Session.getInstance(props, auth);

			// Composing the message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(message);

			// Sending message
			Transport.send(msg);
			System.out.println("Message delivered successfully , Check your mail ...........");
			// response.sendRedirect("mail.jsp?msg=mail delivered");
		} catch (MessagingException e) {
			// TODO: handle exception
			// throw new RuntimeException(e);
			e.printStackTrace();
		}
		return otp1;
	}

}
