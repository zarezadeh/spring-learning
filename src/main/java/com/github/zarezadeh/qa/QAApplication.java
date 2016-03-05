package com.github.zarezadeh.qa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Meysam Zarezadeh <zarezadeh@gmail.com>
 */
public class QAApplication {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        final CommandLineRunner clr = applicationContext.getBean(CommandLineRunner.class);
        System.out.println("Hello World from QA!");
        clr.run();
    }
}
