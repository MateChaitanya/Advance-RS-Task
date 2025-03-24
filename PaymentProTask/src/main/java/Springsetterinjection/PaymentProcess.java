package Springsetterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcess {
	
		CardPayment p;
		
		
		public PaymentProcess() {
			super();
		}


		public void doPay() {
			p.payment();
		}

		
		public CardPayment getP() {
			return p;
		}

		@Autowired
		
		public void setP(@Qualifier("debit")CardPayment p) {
			this.p = p;
		}


		
}