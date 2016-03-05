package com.github.zarezadeh.qa.repo;

import com.github.zarezadeh.qa.model.Question;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Meysam Zarezadeh <zarezadeh@gmail.com>
 */
public class QuestionMapRepository implements QuestionRepository {
    private Map<Long, Question> questionMap = new HashMap<>();

    @Override
    public Question add(Question question) {
        Long id;
        do {
            id = randomId();
        } while (questionMap.containsKey(id));
        question.setId(id);
        questionMap.put(id, question);
        return question;
    }

    @Override
    public Question get(long id) {
        return questionMap.get(id);
    }

    protected long randomId() {
        return Math.abs(new Random().nextInt()) % 1000;
    }

}
