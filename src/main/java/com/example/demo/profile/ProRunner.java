package com.example.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
public class ProRunner implements ApplicationRunner {

    @Autowired
    ProRepository proRepository;

    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = ctx.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));

        System.out.println(proRepository.printState());

        System.out.println(environment.getProperty("app.about"));
    }
}
