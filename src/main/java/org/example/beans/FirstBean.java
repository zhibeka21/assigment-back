package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class FirstBean {
    public String process() {
        return "Data processed by FirstBean";
    }
}
