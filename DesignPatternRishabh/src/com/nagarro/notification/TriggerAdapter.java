package com.nagarro.notification;

/**
 * TriggerAdapter class that sends notification based on trigger, subject and
 * message
 */
public class TriggerAdapter {

	public static void sendNotification(Trigger notification, String subject, String message) {
		notification.send(subject, message);
	}
}
