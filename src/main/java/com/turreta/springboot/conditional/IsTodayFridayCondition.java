package com.turreta.springboot.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class IsTodayFridayCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        /**
         * Is Today Friday?
         */
        LocalDate ld = LocalDate.now();
        DayOfWeek dow = ld.getDayOfWeek();
        return DayOfWeek.FRIDAY == dow;
    }
}
