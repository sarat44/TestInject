package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdditionCalTest {

	@Test
	public void Test() {
		assertEquals(10, new AdditionCal().addition(5.5, 4.5));
	}
}
