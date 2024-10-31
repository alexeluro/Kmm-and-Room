package com.inspiredcoda.kmmandroom

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform