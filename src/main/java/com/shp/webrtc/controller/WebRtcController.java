package com.shp.webrtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebRtcController {

    @GetMapping("/conference")
    public String conference() {
        System.out.println("hello!");
        return "web/examples/conference2.html";
    }
}
