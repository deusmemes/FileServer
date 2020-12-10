package com.example.fileserver.services

import java.io.File

class FileService {
    fun getList(): List<File> {
        return emptyList()
    }

    companion object {
        private var instance: FileService? = null

        fun getInstance(): FileService {
            if (instance == null) {
                instance = FileService()
            }

            return instance!!
        }
    }
}