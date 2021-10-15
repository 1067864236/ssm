package com.youyue.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//扩展mvc配置
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //路径映射
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    //自定义国际化
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    //将拦截器添加进组件
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(
                new LoginHandelerIntercerptor()).
                //添加拦截的路径 /** 所有
                addPathPatterns("/**").
                //不被过滤的请求
                excludePathPatterns("/","/index.html","/user/login","/css/**","/img/**","/js/**");
    }
}
