import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

	@Test
	public void test() {
		Movie m = new Movie("titel", 1);
		assertEquals("titel", m.getTitle());
		assertEquals(1, m.getPriceCode());
		m.setPriceCode(0);
		assertEquals(0, m.getPriceCode());
	}

}
