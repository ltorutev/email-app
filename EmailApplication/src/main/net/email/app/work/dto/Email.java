package main.net.email.app.work.dto;

import java.io.Serializable;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;

public class Email implements Serializable{

	/**
	 * A version of the Object
	 */
	private static final long serialVersionUID = 1L;
	
	private Properties mailProperties ;
	private Session mailSession;
	private MimeMessage mailMimeMessage;
	/**
	 * @return the mailProperties
	 */
	public Properties getMailProperties() {
		return mailProperties;
	}
	/**
	 * @param mailProperties the mailProperties to set
	 */
	public void setMailProperties(Properties mailProperties) {
		this.mailProperties = mailProperties;
	}
	/**
	 * @return the mailSession
	 */
	public Session getMailSession() {
		return mailSession;
	}
	/**
	 * @param mailSession the mailSession to set
	 */
	public void setMailSession(Session mailSession) {
		this.mailSession = mailSession;
	}
	/**
	 * @return the mailMimeMessage
	 */
	public MimeMessage getMailMimeMessage() {
		return mailMimeMessage;
	}
	/**
	 * @param mailMimeMessage the mailMimeMessage to set
	 */
	public void setMailMimeMessage(MimeMessage mailMimeMessage) {
		this.mailMimeMessage = mailMimeMessage;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
