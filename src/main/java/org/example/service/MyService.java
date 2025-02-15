package org.example.service;

import org.example.beans.SecondBean;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final SecondBean secondBean;

    public MyService(SecondBean secondBean) {
        this.secondBean = secondBean;
    }

    public void run() {
        System.out.println(secondBean.execute());
    }
}
