package com.shp.webrtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebRtcController {

    @GetMapping("/conference")
    public String conference() {
        return "/web-sdk/examples/full/conference2";
    }
}
