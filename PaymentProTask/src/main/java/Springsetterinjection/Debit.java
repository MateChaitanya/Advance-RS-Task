package Springsetterinjection;

import org.springframework.stereotype.Component;

@Component
public class Debit implements CardPayment {

	@Override
	public void payment() {
		System.out.println("Payment Debited");
		
	}

}