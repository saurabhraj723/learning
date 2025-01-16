package com.webapp.quizapp.service;

import com.webapp.quizapp.dao.QuestionDao;
import com.webapp.quizapp.dao.QuizDao;
import com.webapp.quizapp.model.Question;
import com.webapp.quizapp.model.QuestionWrapper;
import com.webapp.quizapp.model.Quiz;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions=questionDao.findRandomQuestionsByCategory(category,numQ);

       Quiz quiz=new Quiz();
       quiz.setTitle(title);
       quiz.setQuestions(questions);
       quizDao.save(quiz);
       return new ResponseEntity<>("success", HttpStatus.CREATED);

    }
    @Transactional
    public ResponseEntity<List<QuestionWrapper>> getQuiz(int id) {
       Optional <Quiz> quiz=quizDao.findById(id);
       List<Question>questionsFromDb=quiz.get().getQuestions();
       List<QuestionWrapper>questionForUser=new ArrayList<>();
       for(Question q:questionsFromDb){
           QuestionWrapper qw=new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
           questionForUser.add(qw);
       }
       return new ResponseEntity<List<QuestionWrapper>>(questionForUser,HttpStatus.OK);

    }
}
