package com.joel.shabu.peopledbweb.biz.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data //creates constructors, getters and setters, equals and hashcode method
@AllArgsConstructor
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private BigDecimal salary;
}
