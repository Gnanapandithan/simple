package com.example;

import org.junit.Test;

import junit.framework.Assert;

public class SimpleTest {

	@Test
	public void testSayHello() {
		System.out.println("1111111111111111111111111111");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void testSayHello1() {
		System.out.println("2222222222222222222");
		Assert.assertEquals(true, true);
	}

}
