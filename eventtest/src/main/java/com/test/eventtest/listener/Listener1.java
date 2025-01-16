package com.test.eventtest.listener;

import com.test.eventtest.event.ProgramEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener1
{
    public void watch(String epNo){
        System.out.println("Listener1 is listening"+epNo);
    }
    @EventListener
    public void run(ProgramEvent event){
        watch(event.getEpisodeNo());
    }
}
