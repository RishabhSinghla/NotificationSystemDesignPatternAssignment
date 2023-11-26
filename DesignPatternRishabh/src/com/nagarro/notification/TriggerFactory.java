package com.nagarro.notification;

/**
 * TriggerFactory class that send either EMAIL or SMS object based on channel
 * provided
 */
public class TriggerFactory {

	public static Trigger createNotification(String channel) {
		if ("Email".equalsIgnoreCase(channel)) {
			return new TriggerEmail();
		} else if ("SMS".equalsIgnoreCase(channel)) {
			return new TriggerSMS();
		}
		throw new IllegalArgumentException("Invalid channel: " + channel);
	}
}
