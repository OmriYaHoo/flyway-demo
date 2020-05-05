package com.omriyahoo.flywaydemo;

import com.omriyahoo.flywaydemo.model.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FlywayDemoApplicationTests {

	@Autowired
	private CustomerRepository CustomerRepository;

	@Test
	void contextLoads() {

		assertThat(CustomerRepository).isNotNull();

	}
}
