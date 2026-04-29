package ejemplo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Rectangulo_Test {

	@Test
	void test() {
		Rectangulo r = new Rectangulo(10, 10);

		assertAll(
				() -> assertEquals(100, r.area()), 
				() -> assertEquals(40, r.perimetro()),
				() -> assertEquals(50, r.perimetro()));
			
	}

}
