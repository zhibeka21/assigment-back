package org.example.service;

import org.example.beans.SecondBean;
import org.springframework.stereotype.Service;

@Service
public class MyService { // Renamed class to follow Java conventions
    private final SecondBean secondBean;

    public MyService(SecondBean secondBean) {
        this.secondBean = secondBean;
    }

    public void run() { // Changed "Run" to "run" to follow Java method naming conventions
        System.out.println(secondBean.execute());
    }
}
