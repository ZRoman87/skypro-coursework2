package com.example.skyprocoursework2.service;

import com.example.skyprocoursework2.model.Question;

import java.util.Collection;

public interface QuestionService {

Question add(String question, String answer);
Question remove(String question, String answer);
Collection<Question> getAll();
Question getRandomQuestion();
int getSize();

}
