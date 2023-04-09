package com.joel.shabu.peopledbweb.web.controller;

import com.joel.shabu.peopledbweb.biz.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/people")


public class PeopleController {
    
    @GetMapping
    public String getPeople(Model model){
        List<Person> people = List.of(new Person(10L, "Joel", "Shabu", LocalDate.of(2001, 11, 12), new BigDecimal("120000")),
                new Person(20L, "Sulayam", "AR", LocalDate.of(2001, 9, 22), new BigDecimal("130000")),
                new Person(30L, "Hamad", "Bassam", LocalDate.of(2001, 3, 19), new BigDecimal("140000")),
                new Person(40L, "Nidhin", "Jothi", LocalDate.of(2001, 9, 12), new BigDecimal("150000"))
        );
        model.addAttribute("people",people);
        return "people";
    }
}
