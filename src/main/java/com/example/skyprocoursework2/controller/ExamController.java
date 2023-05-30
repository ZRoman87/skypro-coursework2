package com.example.skyprocoursework2.controller;

import com.example.skyprocoursework2.model.Question;
import com.example.skyprocoursework2.service.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {

    private final ExaminerServiceImpl examinerService;

    public ExamController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping(path = "/get/{amount}")
    public Collection<Question> add(@PathVariable(required = false) int amount) {
        return examinerService.getQuestions(amount);
    }


}
