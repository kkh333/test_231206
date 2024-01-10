package com.mysite.sbb;

import com.mysite.sbb.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void testJpa() {
		this.userService.create(0);
	}

}
