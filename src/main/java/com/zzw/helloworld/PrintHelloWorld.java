package com.zzw.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: Administrator
 * @Date: 2019/2/20 15:20
 * @Description:
 */
@Controller
public class PrintHelloWorld {
    @RequestMapping("/fagelaile")
    @ResponseBody
    public String test() {
        return "hello world!";
    }
}
