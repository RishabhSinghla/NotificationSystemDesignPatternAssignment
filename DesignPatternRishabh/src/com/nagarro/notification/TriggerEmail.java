package com.nagarro.notification;

/**
 * TriggerEmail class implements Trigger interface and send an email message
 */
public class TriggerEmail implements Trigger {

	@Override
	public void send(String subject, String message) {
		System.out.println("Email sent - Subject: " + subject + ", Message: " + message);
	}
}
