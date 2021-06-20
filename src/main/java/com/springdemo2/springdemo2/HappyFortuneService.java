package com.springdemo2.springdemo2;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune(){
        return "Always focus what you want in your life";
    }
}
