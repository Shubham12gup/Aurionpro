package com.aurionpro.model;

import java.util.List;

public class NotificationIterator implements CollectionIterator {
	
	List<Notification> notificationList;
	
	public NotificationIterator(List<Notification> notificationList) {
		super();
		this.notificationList = notificationList;
	}

	@Override
	public boolean hasNext() {
		if (pos >= notificationList.size() || notificationList.get(pos) == null)
	            return false;
	        else
	            return true;
	}

	int pos=0;
	@Override
	public Object next() {
		Notification notification =  notificationList.get(pos);
        pos += 1;
        return notification;
	}

}
