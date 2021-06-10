package com.devopsclass.tomcatapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

@SpringBootTest
class TomcatappApplicationTests {

	@Test
	void basicURL_test() {
		TomcatappApplication app = new TomcatappApplication();
		Assert.assertTrue("Welcome to Spring Boot Hello World Tutorial".equals(app.basicURL()));
	}
	
	@Test
	void crunchifyURL_test()
	{
		TomcatappApplication app = new TomcatappApplication();
		Assert.assertTrue("Hello Crunchify Friends! This is your first SpringBoot Example. Isn't that so Simple?".equals(app.crunchifyURL()));
	}
}
