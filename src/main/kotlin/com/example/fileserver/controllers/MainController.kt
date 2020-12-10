package com.example.fileserver.controllers

import com.example.fileserver.services.FileService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import java.io.File

@RestController
class MainController {
    val service = FileService.getInstance()
    val outDir = "D://server_files"

    @GetMapping(value = ["/test"])
    fun test() : String {
        println("test")
        return "test"
    }

    @PostMapping(value = ["/upload"])
    fun upload(@RequestParam("file") multipartFile: MultipartFile) {
        val file = File("$outDir/${multipartFile.originalFilename}")
        multipartFile.transferTo(file)
        println("Файл ${multipartFile.originalFilename} успешно загружен на сервер")
    }
}