package com.springdemo2.springdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("footballCoach")
public class footballCoach implements Coach{
    @Autowired
    @Qualifier("randomFrotuneService")
    private FortuneService fortune;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String name;

    @Override
    public String getDailyWorkout(){
        return "Practice running hard ";

    }
    // Add dependency injection using at Setter Injection
    /*
    @Autowired
    public void setFortune(FortuneService fortune) {
        System.out.println(">> Inside the setFrotune method");
        this.fortune = fortune;
    }
    */

    // use random method use for dependency injection
    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortune) {
        System.out.println(">> Inside the Random method");
        this.fortune = fortune;
    }

     */

    @Override
    public String getDailyFortune(){
        return this.fortune.getFortune();
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public String getEmail(){
        return this.email;
    }
}
