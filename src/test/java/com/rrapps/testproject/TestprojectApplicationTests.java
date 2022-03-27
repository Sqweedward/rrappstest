package com.rrapps.testproject;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class TestprojectApplicationTests {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Test
	void contextLoads() {
	}
//	@Test
	void insertClients() {
		Faker faker = new Faker();
		for (int i = 0; i < 30; i++) {
			String name = faker.name().fullName();
			System.out.println(name);
			jdbcTemplate.execute("insert into clients (fio) values ('"+name+"')");
		}

	}
//	@Test
	void insertAccounts() {
		Faker faker = new Faker();
		for (int i = 0; i < 100; i++) {
			int id_cli = faker.number().numberBetween(100, 132);
			int valute = faker.number().numberBetween(0,999);
			double balance = faker.number().randomDouble(4,0,2000000);
			long aDay = TimeUnit.DAYS.toMillis(1);
			long now = new Date().getTime();
			Date hundredYearsAgo = new Date(now - aDay * 365 * 5);
			Date tenDaysAgo = new Date(now - aDay * 1);
			long startMillis = hundredYearsAgo .getTime();
			long endMillis = tenDaysAgo.getTime();
			long randomMillisSinceEpoch = ThreadLocalRandom
					.current()
					.nextLong(startMillis, endMillis);
			String randomDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(randomMillisSinceEpoch));
			jdbcTemplate.execute("insert into accounts ([idClient], [vkd], [balance], [lastOperdate]) values ("+id_cli+", "+valute+", "+balance+", '"+randomDate+"')");
		}
	}

}
