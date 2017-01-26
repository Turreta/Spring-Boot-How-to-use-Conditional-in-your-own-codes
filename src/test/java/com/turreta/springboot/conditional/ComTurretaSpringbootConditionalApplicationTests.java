package com.turreta.springboot.conditional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.DayOfWeek;
import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComTurretaSpringbootConditionalApplicationTests {

	@Autowired(required = false)
	private FridayOnlyBean fridayOnlyBean;

	@Autowired(required = false)
	private EveryDayBean everyDayBean;

	@Test
	public void testFridayOnlyBean() {


		LocalDate ld = LocalDate.now();
		DayOfWeek dow = ld.getDayOfWeek();
		if(DayOfWeek.FRIDAY == dow) {
			Assert.assertNotNull(fridayOnlyBean);
		} else {
			Assert.assertNull(fridayOnlyBean);
		}

	}

	@Test
	public void testEveryDayBean() {
		Assert.assertNotNull(everyDayBean);
	}

}
