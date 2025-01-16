package com.test.eventtest.publisher;

import com.test.eventtest.event.ProgramEvent;
import com.test.eventtest.event.ShowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SonyPublisher {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;
    public void HindiShow(String epNo){
        System.out.println("Streaming episode"+epNo);
        applicationEventPublisher.publishEvent(new ProgramEvent(epNo));

    }
    public void EnglishShow(String epNo){
        System.out.println("Streaming episode"+epNo);
        applicationEventPublisher.publishEvent(new ShowEvent(epNo));
    }
}
