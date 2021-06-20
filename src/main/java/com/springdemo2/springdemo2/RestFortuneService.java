package com.springdemo2.springdemo2;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService{
    @Override
    public String getFortune(){
        return "REST fortune service here";
    }
}
