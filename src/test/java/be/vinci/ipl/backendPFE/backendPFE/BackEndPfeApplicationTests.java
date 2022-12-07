package be.vinci.ipl.backendPFE.backendPFE;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BackEndPfeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void assetHelloWorld() {
		assertEquals("hello","hello");
	}
}
