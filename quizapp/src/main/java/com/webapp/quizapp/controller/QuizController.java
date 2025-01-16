package com.webapp.quizapp.controller;

import com.webapp.quizapp.model.Question;
import com.webapp.quizapp.model.QuestionWrapper;
import com.webapp.quizapp.model.Quiz;
import com.webapp.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    QuizService quizService;
    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,@RequestParam int numQ,@RequestParam String title){
        return quizService.createQuiz(category,numQ,title);
    }

    @GetMapping("/getquiz/{id}")
    public ResponseEntity<List<QuestionWrapper>>getQuiz(@PathVariable int id){
        return quizService.getQuiz(id);
    }

}
