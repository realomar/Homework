

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarLoanTest {

	@Test
	void testCarLoan() {
		CarLoan altima = new CarLoan(20000,0,24,.05);
		System.out.println(altima.interestPaid());
		System.out.println(altima.monthlyRate());
		if(altima.monthlyRate() != 877.0)
			fail("Monthly rate is wrong");
		
	}

}
