package spring.cloud.eureka.consumer.service;


import org.springframework.stereotype.Component;

@Component
public class HomeServiceHystrix implements IHomeService {
    @Override
    public String getBook(String name){
        return "sorry server is down";
    }

}
