package com.dish.assignment.interceptor;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigFile implements WebMvcConfigurer {
//    @Bean
//    public RestTemplate restTemplate() {
//        RestTemplate restTemplate = new RestTemplate();
//
//        List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
//        if (CollectionUtils.isEmpty(interceptors)) {
//            interceptors = new ArrayList<>();
//        }
//        interceptors.add((ClientHttpRequestInterceptor) new RestTemplateInterceptor());
//        restTemplate.setInterceptors(interceptors);
//        return restTemplate;
//    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(new GeneralPurposeInterceptor()).addPathPatterns("/welcome");
        registry.addInterceptor(new SinglePurposeInterceptor()).addPathPatterns("/dynamic-configuration");
    }
}
