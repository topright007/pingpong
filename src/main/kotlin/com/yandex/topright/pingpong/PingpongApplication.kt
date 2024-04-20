package com.yandex.topright.pingpong

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PingpongApplication

fun main(args: Array<String>) {
	runApplication<PingpongApplication>(*args)
}
