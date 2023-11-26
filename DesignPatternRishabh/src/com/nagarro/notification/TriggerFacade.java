package com.nagarro.notification;

/**
 * TriggerFacade class has notify method for notifying its subscribers
 */
public class TriggerFacade {

	public static void notify(String channel, String subject, String message) {
		Trigger notification = TriggerFactory.createNotification(channel);
		TriggerAdapter.sendNotification(notification, subject, message);
	}
}
