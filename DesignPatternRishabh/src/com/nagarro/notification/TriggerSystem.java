package com.nagarro.notification;

/**
 * TriggerSystem is the main class for the application
 */
public class TriggerSystem {

	public static void main(String[] args) {

		TriggerService triggerService = TriggerService.getInstance();
		TriggerUser triggeruser = new TriggerUser("Rishabh Singhla");
		triggerService.addSubscriber(triggeruser);
		triggerService.addSubscriber(new TriggerUser("Swapnil"));
		String channel = args[0];
		String subject = args[1];
		String message = args[2];
		TriggerFacade.notify(channel, subject, message);
		triggeruser.update(message);
	}
}
