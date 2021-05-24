package examplejunit.blackjack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.qa.examplejunit.blackjack.BlackJack;

public class BlackJackTest {

	@Test
	public void addTest() {
		int result = BlackJack.play(12, 22);
		assertEquals(12, result);
		
		int result2 = BlackJack.play(22, 12);
		assertEquals(12, result2);
		
		int result3 = BlackJack.play(22, 22);
		assertEquals(0, result3);
	}


}