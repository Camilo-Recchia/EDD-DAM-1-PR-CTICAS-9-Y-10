package ejemplo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Rectangulo_Test {

	@Test
	void test() {
		Rectangle r = new Rectangle(10, 10);

		assertAll(
				() -> assertEquals(100, r.superface()), 
				() -> assertEquals(40, r.perimeter()),
				() -> assertEquals(50, r.perimeter()));
			
	}

}
