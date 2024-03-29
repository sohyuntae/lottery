package com.service.lottery.contorller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LotteryController {

    @GetMapping(name = "/")
    fun lotteryMain (): ResponseEntity<String> {
        val hello = "Hello World"
        return ResponseEntity.ok(hello)
    }
}
