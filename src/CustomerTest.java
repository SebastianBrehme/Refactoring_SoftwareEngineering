import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void test() {
		Customer c = new Customer("name");
		assertEquals("name", c.getName());
		
	}

}
