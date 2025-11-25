package com.vpr42.marketplaceeureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class MarketplaceEurekaApplication

fun main(args: Array<String>) {
    runApplication<MarketplaceEurekaApplication>(*args)
}
