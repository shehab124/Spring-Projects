package com.udacity.jwdnd.c1.course1;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Locale;


@Component
public class MessageService {

    private String message;
    private String ayy;
    public MessageService(String message)
    {
        this.message = message;
    }

    @Autowired
    @Qualifier("ayy")
    public void setAyy(String ayy) {
        System.out.println("AYYYYY CALLED WITH VALUE: " + ayy);
        this.ayy = ayy;
    }

    public String getAyy() {
        return ayy;
    }
}
