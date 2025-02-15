package org.example;

import org.example.beans.FirstBean;
import org.example.beans.SecondBean;
import org.example.config.AppConfig;
import org.example.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        FirstBean firstBean = context.getBean(FirstBean.class);
        firstBean.process();

        SecondBean secondBean = context.getBean(SecondBean.class);
        secondBean.execute();

        MyService myService = context.getBean(MyService.class);
        myService.run();
    }
}
