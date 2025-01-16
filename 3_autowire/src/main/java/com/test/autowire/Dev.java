package com.test.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev
{
  @Autowired       // it basically type check the object
//    private laptop l1;
//    private Desktop d1;

    // in case of multiple beans it is either you could use @Primary on the class/bean on that one. or use simply use qualifier(bean name) making it as a single bean.
//    @Qualifier("laptop")
    @Qualifier("desktop")
    private Computer c1;  // field injection





    public void take(){
        c1.use();
        System.out.println("hello");
    }

}
