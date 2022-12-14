package com.example.validation.validator;

import com.example.validation.annotation.YearMonth;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearMonthValidator implements ConstraintValidator<YearMonth, String> {

    private String pattern;

    @Override
    public void initialize(YearMonth constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
//        System.out.println("log log : "  + this.reqYearMonth+ "01");
        System.out.println("pattern what? : " + this.pattern);
        try {
            LocalDate localDate = LocalDate.parse(value+ "01", DateTimeFormatter.ofPattern("yyyyMMdd"));
        }catch (Exception e) {
            return false;}
        return true;

    }
}
