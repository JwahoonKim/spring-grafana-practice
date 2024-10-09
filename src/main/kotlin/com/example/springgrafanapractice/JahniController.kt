package com.example.springgrafanapractice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class JahniController(
    private val jahniService: JahniService
) {

    @GetMapping("/apply")
    fun apply(): String {
        jahniService.apply()
        return "ok"
    }

}