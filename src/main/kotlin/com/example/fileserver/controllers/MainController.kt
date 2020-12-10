package com.example.fileserver.controllers

import com.example.fileserver.services.FileService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    val service = FileService.getInstance()

    @GetMapping(value = ["/test"])
    fun test() : String {
        println("test")
        return "test"
    }
}