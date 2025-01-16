package com.test.eventtest.event;

import org.springframework.stereotype.Component;


public class ShowEvent
{
    String epNo;

    public ShowEvent(String epNo) {
        this.epNo = epNo;
    }

    public String getEpNo() {
        return epNo;
    }
}
