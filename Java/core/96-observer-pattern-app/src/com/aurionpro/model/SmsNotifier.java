package com.aurionpro.model;

public class SmsNotifier implements INotifier{

	@Override
	public void sendNotification(Account account, double amount, String transactionType) {
		if (transactionType == "withdraw") {
			System.out.println("SMS Notification");
			System.out.println(amount + " rupees has been withdrawn from your acount. Your current balance is " +account.getBalance());
		} 
		else if (transactionType == "deposit") {
			System.out.println("SMS Notification");
			System.out.println(amount + " rupees has been deposited to your acount. Your current balance is " +account.getBalance());
		}
	}

}
