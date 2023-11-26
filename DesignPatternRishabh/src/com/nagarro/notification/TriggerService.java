package com.nagarro.notification;

import java.util.ArrayList;
import java.util.List;

/**
 * TriggerService class for adding, removing, notifying subscribers
 */
public class TriggerService {

	private static TriggerService triggerService;
	private List<Observer> subscribers;

	private TriggerService() {
		subscribers = new ArrayList<>();
	}

	public static TriggerService getInstance() {
		if (triggerService == null) {
			triggerService = new TriggerService();
		}
		return triggerService;
	}

	public void addSubscriber(Observer subscriber) {
		subscribers.add(subscriber);
	}

	public void removeSubscriber(Observer subscriber) {
		subscribers.remove(subscriber);
	}

	public void notifySubscribers(String message) {
		for (Observer subscriber : subscribers) {
			subscriber.update(message);
		}
	}
}
