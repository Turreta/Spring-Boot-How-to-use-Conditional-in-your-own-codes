package com.turreta.springboot.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    @Conditional(IsTodayFridayCondition.class)
    public FridayOnlyBean createFridayOnlyBean() {
        return new FridayOnlyBean();
    }

    @Bean
    @Conditional(ActiveEveryDayCondition.class)
    public EveryDayBean createEveryDayBean() {
        return new EveryDayBean();
    }
}
