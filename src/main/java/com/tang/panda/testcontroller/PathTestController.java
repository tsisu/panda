package com.tang.panda.testcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class PathTestController {
    @RequestMapping("/toadd")
    public String toadd(){
        return "sys/area/add";
    }
    @RequestMapping("/upload")
    public String upload(){
        return "sys/area/upload";
    }
}
