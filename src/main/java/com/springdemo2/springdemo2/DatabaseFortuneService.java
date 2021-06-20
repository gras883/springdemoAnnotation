package com.springdemo2.springdemo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary -- This will make default injection when multiple same of bean injected
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortune(){
        return "Random fortune serivce here";
    }
}
