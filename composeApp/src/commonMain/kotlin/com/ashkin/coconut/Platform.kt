package com.ashkin.coconut

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform