package com.nagarro.notification;

/**
 * TriggerSMS class implements Trigger interface and send a SMS message
 */
public class TriggerSMS implements Trigger {

	@Override
	public void send(String subject, String message) {
		System.out.println("SMS sent - Subject: " + subject + ", Message: " + message);
	}
}
