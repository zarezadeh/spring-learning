package com.github.zarezadeh.qa;

import com.github.zarezadeh.qa.repo.QuestionMapRepository;
import com.github.zarezadeh.qa.repo.QuestionRepository;

import java.io.IOException;

/**
 * @author Meysam Zarezadeh <zarezadeh@gmail.com>
 */
public class QAApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World from QA!");
        QuestionRepository questionRepo = new QuestionMapRepository();
        final CommandLineRunner clr = new CommandLineRunner(questionRepo);
        clr.run();
    }
}
