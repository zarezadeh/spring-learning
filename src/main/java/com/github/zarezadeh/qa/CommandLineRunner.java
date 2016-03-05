package com.github.zarezadeh.qa;

import com.github.zarezadeh.qa.model.Question;
import com.github.zarezadeh.qa.repo.QuestionRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Meysam Zarezadeh <zarezadeh@gmail.com>
 */
public class CommandLineRunner {
    private QuestionRepository questionRepo;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public CommandLineRunner(QuestionRepository questionRepo) {
        this.questionRepo = questionRepo;
    }


    public void run() throws IOException {
        while (true) {
            final String command = reader.readLine();
            if (command == null) {
                return;
            }
            switch (command) {
                case "add":
                    newQuestion();
                    break;
                case "get":
                    fetchQuestion();
                    break;
                case "quit":
                    return;
            }
        }
    }

    private void fetchQuestion() throws IOException {
        System.out.println("ID: ");
        final long id = Long.parseLong(reader.readLine());
        Question question = questionRepo.get(id);
        if (question == null) {
            System.out.println("Question with this Id not found");
        } else {
            System.out.println(question);
        }
    }

    private void newQuestion() throws IOException {
        System.out.println("Title:");
        final String title = reader.readLine();
        System.out.println("Detail:");
        final String detail = reader.readLine();
        final Question question = new Question();
        question.setTitle(title);
        question.setDetail(detail);
        questionRepo.add(question);
        System.out.println("Question Added Successfully");
        System.out.println(question);
    }
}
