package com.yandex.topright.pingpong

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service
import java.util.concurrent.TimeUnit

@Service
class KtorServer {

    var appEngine: ApplicationEngine? = null

    @PostConstruct
    public fun postConstruct() {
        appEngine = embeddedServer(Netty, port = 8081) {
            routing {
                get("/") {
                    call.respondText("Hello, world! this is KTOR!")
                }
            }
        }.start(wait = false)
    }

    public fun preDestroy() {
        appEngine?.stop(1000, 10, TimeUnit.SECONDS)
    }

}