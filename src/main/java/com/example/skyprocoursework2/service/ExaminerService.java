package com.example.skyprocoursework2.service;

import com.example.skyprocoursework2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
