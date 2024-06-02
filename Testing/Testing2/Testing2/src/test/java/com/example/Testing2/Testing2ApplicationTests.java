package com.example.Testing2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class Testing2ApplicationTests {

	@Test
	public void test1()
	{
		int a =1;
		int b = 1;
		assertEquals(2, a+b);
	}

}
