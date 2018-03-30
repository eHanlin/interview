package com.eHanlin.api.controller

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InterviewController {

    @RequestMapping("/with/{name}")
    def hello(@PathVariable String name) {
        [hello: name]
    }

}

