package com.yandex.topright.pingpong

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TomcatServer {

    @PostConstruct
    public fun postConstruct() {
        println("dmne was here")
    }

    @GetMapping("/tomcat")
    public fun getRoot(): String {
        return "Hello world! this is tomcat!"
    }

}