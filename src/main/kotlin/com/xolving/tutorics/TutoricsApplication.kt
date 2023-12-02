package com.xolving.tutorics

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication()
class TutoricsApplication

fun main(args: Array<String>) {
	runApplication<TutoricsApplication>(*args)
}
