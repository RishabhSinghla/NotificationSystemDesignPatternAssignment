package com.nagarro.notification;

/**
 * Trigger interface for sending a message
 */
public interface Trigger {

	void send(String subject, String message);
}
