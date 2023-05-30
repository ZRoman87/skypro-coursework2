package com.example.skyprocoursework2.service;

import com.example.skyprocoursework2.exception.BadQuestionsAmountException;
import com.example.skyprocoursework2.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService{

    private final JavaQuestionServiceImpl javaQuestionService;

    public ExaminerServiceImpl(JavaQuestionServiceImpl javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }
    //private List<Question> questionList = new ArrayList<>();

    @Override
    public Collection<Question> getQuestions(int amount){

        Question q;
        List<Question> questionList = new ArrayList<>();

        if (amount > javaQuestionService.getSize() || amount <= 0) {
            throw new BadQuestionsAmountException();
        } else {
            while (questionList.size() != amount) {
                q = javaQuestionService.getRandomQuestion();
                if (!questionList.contains(q)) {
                    questionList.add(q);
                }
            }
            return questionList;
        }
    }
}
