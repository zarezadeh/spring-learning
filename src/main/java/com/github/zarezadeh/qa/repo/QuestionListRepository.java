package com.github.zarezadeh.qa.repo;

import com.github.zarezadeh.qa.model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Meysam Zarezadeh <zarezadeh@gmail.com>
 */
public class QuestionListRepository implements QuestionRepository {
    private List<Question> questions = new ArrayList<>();

    @Override
    public Question add(Question question) {
        long id = randomId();
        question.setId(id);
        questions.add(question);
        return question;
    }

    protected long randomId() {
        return Math.abs(new Random().nextInt()) % 1000;
    }

    @Override
    public Question get(long id) {
        for (Question question : questions) {
            if (question.getId().equals(id)) {
                return question;
            }
        }
        return null;
    }
}
