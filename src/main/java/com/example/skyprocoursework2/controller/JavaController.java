package com.example.skyprocoursework2.controller;

import com.example.skyprocoursework2.model.Question;
import com.example.skyprocoursework2.service.JavaQuestionServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaController {

    private final JavaQuestionServiceImpl javaQuestionService;
    public JavaController(JavaQuestionServiceImpl javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @GetMapping(path = "/add")
    public Question add(@RequestParam(required = false) String question,
                        @RequestParam(required = false) String answer
    ) {
        return javaQuestionService.add(question, answer);
    }
    @GetMapping(path = "/remove")
    public Question remove(@RequestParam(required = false) String question,
                           @RequestParam(required = false) String answer
    ) {
        return javaQuestionService.remove(question, answer);
    }
    @GetMapping()
    public Collection<Question> getAll() {
        return javaQuestionService.getAll();
    }
    @GetMapping("/random")
    public Question getRandomQuestion() {
        return javaQuestionService.getRandomQuestion();
    }
}
