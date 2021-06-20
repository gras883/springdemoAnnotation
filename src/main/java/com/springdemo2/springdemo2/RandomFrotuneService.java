package com.springdemo2.springdemo2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFrotuneService implements FortuneService {

    String[] data = {"Time will come so never stop working",
                    "One day you build a system which will scalable",
                    "wait for the right time"};

    Random myrandom = new Random();
    @Override
    public String getFortune(){
        int index = myrandom.nextInt(data.length);
        return data[index];
    }

}
