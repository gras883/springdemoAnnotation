package com.springdemo2.springdemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan
public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read spring cofig file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationDemoApp.class);

        //get the bean form Spring Container
        Coach thesilly = context.getBean("tennisCoach", Coach.class);

        // call teh method from bean
        System.out.println("____________" + thesilly.getDailyWorkout()  + "____________" );

        // get dailyfortune from bean
        System.out.println("____________" + thesilly.getDailyFortune()  + "____________" );

        //close teh container
        context.close();
    }
}
