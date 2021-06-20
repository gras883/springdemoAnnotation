package com.springdemo2.springdemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ComponentScan
public class DependencyInjection2 {
    public static void main(String[] args) {

        //config the spring container
        //AnnotationConfigApplicationContext context =
        //        new AnnotationConfigApplicationContext(DependencyInjection2.class);

        // Xml path configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-config");

        // get the bean
        Coach thecoach = context.getBean("footballCoach", Coach.class);

        // call teh method from bean
        System.out.println("____________" + thecoach.getDailyWorkout()  + "____________" );

        // get dailyfortune from bean
        System.out.println("____________" + thecoach.getDailyFortune()  + "____________" );

        // extract the instance field
        System.out.println("____________" + thecoach.getName()  + "____________" );

        // extract the instance field
        System.out.println("____________" + thecoach.getEmail()  + "____________" );

        //close teh container
        context.close();
    }
}
