package com.codesanook.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import java.util.Locale;

@Configuration
public class WebConfig  extends WebMvcConfigurerAdapter {

        @Bean
        public LocaleResolver localeResolver() {
            CookieLocaleResolver resolver = new CookieLocaleResolver();
            resolver.setDefaultLocale(new Locale("th"));
            resolver.setCookiePath("/");
            resolver.setCookieName("cs-user-local");
            int ageInSeconds = 30 * 24 * 60 * 60;
            resolver.setCookieMaxAge(ageInSeconds);
            return resolver;
        }

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
            lci.setParamName("lang");
            registry.addInterceptor(lci);
        }


    }
