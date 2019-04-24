package spring.cloud.eureka.consumer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.cloud.eureka.consumer.service.*;
@Controller
@RequestMapping(value = "/test")
@Api(value = "eureka-consumer", description = "学生查询接口")
public class TestController {

    @Autowired
    IHomeService homeService;



    @ResponseBody
    @GetMapping("/list")
    @ApiOperation(value="测试", notes="测试")
    public String getTest(String name){
            return homeService.getBook(name);
    }

}
