package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleApplicationTests {

	@Test
	public void contextLoads() {
		for( int i=0;i<100;i++) {
			System.out.println("WWWWWWWWWw");
		}
	}

}
