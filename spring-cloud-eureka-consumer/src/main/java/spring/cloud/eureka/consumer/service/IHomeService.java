package spring.cloud.eureka.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-provider",fallback = HomeServiceHystrix.class)
public interface IHomeService {
    @RequestMapping(value = "/book",method = RequestMethod.GET)
    String getBook(@RequestParam(value = "name") String name);
}
