package com.test.eventtest.listener;

import com.test.eventtest.event.ProgramEvent;
import com.test.eventtest.event.ShowEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener3 {
    public void watch(String epNo){
        System.out.println("Listener3 is listening"+epNo);
    }
    @EventListener
    public void run(ShowEvent event){
        watch(event.getEpNo());
    }
}
