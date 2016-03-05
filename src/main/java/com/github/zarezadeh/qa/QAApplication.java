package com.github.zarezadeh.qa;

import java.io.IOException;

/**
 * @author Meysam Zarezadeh <zarezadeh@gmail.com>
 */
public class QAApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World from QA!");
        final CommandLineRunner clr = new CommandLineRunner();
        clr.run();
    }
}
