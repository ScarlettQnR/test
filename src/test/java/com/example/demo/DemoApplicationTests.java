package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testAddMethod (){
		Calculator calculator = new Calculator();
		int sum = calculator.add(2, 3);
		Assert.isTrue(sum==5, "Test failed, values differ");
	}
}
