package com.github.zarezadeh.qa.repo;

import com.github.zarezadeh.qa.model.Question;

/**
 * @author Meysam Zarezadeh <zarezadeh@gmail.com>
 */
public interface QuestionRepository {
    Question add(Question question);

    Question get(long id);
}
