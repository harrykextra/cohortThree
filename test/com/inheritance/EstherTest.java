package com.inheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstherTest {
	Tochukwu esther;

	@BeforeEach
	void setUp() throws Exception {
		esther = new Tochukwu();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void estherExistsTest() {
		assertNotNull(esther);
	}
	
	@Test
	void estherCanSing() {
		assertEquals("like an angel", esther.canSing());
	}

}
