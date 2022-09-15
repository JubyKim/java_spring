package com.example.springioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

@SpringBootApplication
public class SpringIocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIocApplication.class, args);



        ApplicationContext context = ApplicationContextProvider.getContext();

        Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
        UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);

        Encoder encoder = new Encoder(base64Encoder);
        String url = "www.naver.com/boooks/it?page=10&size=20&name=spring-boot";

        String result = encoder.encode(url);
        encoder.setIEncoder(urlEncoder);
        System.out.print(result);
    }
}
