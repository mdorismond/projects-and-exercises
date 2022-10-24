package com.techelevator.dao;

import com.techelevator.model.QuizQuestion;

import java.util.List;

public interface QuizQuestionDao {

    List<QuizQuestion> getQuestionsForQuiz(String quizName);
}
