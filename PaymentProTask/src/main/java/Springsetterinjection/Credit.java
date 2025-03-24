package Springsetterinjection;

import org.springframework.stereotype.Component;

@Component
public class Credit implements CardPayment {

	
	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Credit Payment");
	}
	

}