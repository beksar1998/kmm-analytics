package com.beksar.kmm.analytics

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform