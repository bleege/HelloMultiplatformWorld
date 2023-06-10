package io.leege.hellomultiplatformworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform