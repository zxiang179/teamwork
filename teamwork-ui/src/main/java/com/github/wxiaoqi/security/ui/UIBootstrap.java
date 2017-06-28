package com.github.wxiaoqi.security.ui;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class UIBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(UIBootstrap.class).web(true).run(args);    }
}
