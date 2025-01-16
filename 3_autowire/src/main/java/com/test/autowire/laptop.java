package com.test.autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class laptop implements Computer{
    @Override
    public void use() {
        System.out.println("from laptop");
    }


}
